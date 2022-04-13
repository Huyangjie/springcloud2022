package cn.leon.controller;

import cn.leon.entity.CommonResult;
import cn.leon.entity.Payment;
import cn.leon.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){

        int i = paymentService.create(payment);
        log.info("--- 插入数据 ---"+i);
        if (i>0){
            return  new CommonResult(200, "success==port"+serverPort, payment);

        }else {
            return new CommonResult(400, "faild", null);
        }
    }

    @RequestMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info("--- 查询数据 ---");
        if (payment!=null){
            return  new CommonResult(200, "success==port"+serverPort, payment);

        }else {
            return new CommonResult(400, "faild", null);
        }
    }

    @GetMapping("/payment/discoveryClient")
    public Object discover(){
        List<String> services = discoveryClient.getServices();

        for (String service : services) {
            log.info("service==="+service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        for (ServiceInstance instance : instances) {
            log.info("===getInstanceId==="+instance.getInstanceId()+"===getHost==="+instance.getHost()+"===getPort==="+instance.getPort()+"===getUri==="+instance.getUri());
        }

        return discoveryClient;
    }


    @RequestMapping("/payment/timeout")
    public String paymentTimeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);

        return "111";

    }

}
