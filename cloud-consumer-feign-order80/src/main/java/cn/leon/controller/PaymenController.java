package cn.leon.controller;

import cn.leon.entity.CommonResult;
import cn.leon.entity.Payment;
import cn.leon.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leon
 * @create 2022-04-02 18:12
 * IntelliJ IDEA
 * cn.leon.controller
 */
@RestController
@Slf4j
public class PaymenController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        return paymentService.create(payment);
    }

    @RequestMapping("/consumer/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        return paymentService.getPaymentById(id);
    }

    @RequestMapping("/consumer/payment/timeout")
    public String paymentTimeOut() throws InterruptedException {
        return paymentService.paymentTimeOut();

    }
}
