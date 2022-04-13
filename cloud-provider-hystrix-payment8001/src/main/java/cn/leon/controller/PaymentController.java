package cn.leon.controller;

import cn.leon.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leon
 * @create 2022-04-02 21:56
 * IntelliJ IDEA
 * cn.leon.controller
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_OK(id);
        log.info("****result: " + result);
        return result;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutFb",
            commandProperties = {@HystrixProperty(name = "exception.isolation.thread.timeoutInMilliseconds",value = "3000")}
            )
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) throws InterruptedException {
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("****result: " + result);
        return result;
    }

    public String paymentInfo_TimeOutFb(Integer id){
        return "超时或异常";
    }


    @RequestMapping("/payment/hystrix/break/{id}")
    public String paymentInfo_Break(@PathVariable("id") Integer id) {
        String s = paymentService.paymentInfo_Break(id);
        return s;

    }
}
