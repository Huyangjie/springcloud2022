package cn.leon.service;

import cn.leon.entity.CommonResult;
import cn.leon.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Leon
 * @create 2022-04-02 18:07
 * IntelliJ IDEA
 * cn.leon.service
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentService {

    @RequestMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment);

    @RequestMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id);


    @RequestMapping("/payment/timeout")
    public String paymentTimeOut() throws InterruptedException;

}
