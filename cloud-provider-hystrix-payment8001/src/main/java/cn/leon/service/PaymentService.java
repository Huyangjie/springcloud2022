package cn.leon.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Leon
 * @create 2022-04-02 21:55
 * IntelliJ IDEA
 * cn.leon.service
 */
@Service
public class PaymentService {

    //===============服务降级=====================

    /**
     * 正常访问，一切OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id)
    {
        return "线程池:"+Thread.currentThread().getName()+"paymentInfo_OK,id: "+id+"\t"+"O(∩_∩)O";
    }

    /**
     * 超时访问，演示降级
     * @param id
     * @return
     */
    public String paymentInfo_TimeOut(Integer id)
    {
        try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池:"+Thread.currentThread().getName()+"paymentInfo_TimeOut,id: "+id+"\t"+"O(∩_∩)O，耗费3秒";
    }



    //===============服务熔断=====================

    @HystrixCommand(fallbackMethod = "paymentInfo_BreakFb",commandProperties = {
        @HystrixProperty(name = "circuitBreaker.enabled",value = "true")
    })
    public String paymentInfo_Break(Integer id){
        if(id<0){
            throw  new RuntimeException("---");
        }
        String simpleUUID = IdUtil.simpleUUID();

        return Thread.currentThread().getName()+"\t"+simpleUUID;
    }

    public String paymentInfo_BreakFb(Integer id){

        return "balabala熔断中》》》》";
    }
}
