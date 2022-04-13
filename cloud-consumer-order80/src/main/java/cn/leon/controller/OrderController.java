package cn.leon.controller;

import cn.leon.entity.CommonResult;
import cn.leon.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Leon
 * @create 2022-04-01 0:20
 * IntelliJ IDEA
 * cn.leon.controller
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/create")
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject("http://CLOUD-PAYMENT-SERVICE/payment/create", payment, CommonResult.class);
    }


    @RequestMapping("/consumer/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable long id){
        return restTemplate.getForObject("http://CLOUD-PAYMENT-SERVICE/payment/getPaymentById/"+id, CommonResult.class, id);
    }
}
