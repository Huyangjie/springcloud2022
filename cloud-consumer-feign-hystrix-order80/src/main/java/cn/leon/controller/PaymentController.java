package cn.leon.controller;

import cn.leon.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Leon
 * @create 2022-04-06 16:33
 * IntelliJ IDEA
 * cn.leon.controller
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "globakFallback")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;



    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentService.paymentInfo_OK(2);

    }


    //@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutFb")
    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        return paymentService.paymentInfo_TimeOut(2);
    }

    public String paymentInfo_TimeOutFb(@PathVariable("id") Integer id){
        return "80失败";
    }

    public String globakFallback(){
        return "global fallback";
    }

}
