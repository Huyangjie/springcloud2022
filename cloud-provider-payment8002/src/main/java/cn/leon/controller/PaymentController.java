package cn.leon.controller;

import cn.leon.entity.CommonResult;
import cn.leon.entity.Payment;
import cn.leon.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Leon
 * @create 2022-04-01 0:29
 * IntelliJ IDEA
 * cn.leon.controller
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value(("${server.port}"))
    private String serverPort;

    @RequestMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){

        int i = paymentService.create(payment);
        log.info("--- 插入数据 ---"+i);
        if (i>0){
            return  new CommonResult(200, "success=="+serverPort, payment);

        }else {
            return new CommonResult(400, "faild", null);
        }
    }

    @RequestMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info("--- 查询数据 ---");
        if (payment!=null){
            return  new CommonResult(200, "success=="+serverPort, payment);

        }else {
            return new CommonResult(400, "faild", null);
        }
    }

}
