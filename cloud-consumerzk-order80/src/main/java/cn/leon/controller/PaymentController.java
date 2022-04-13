package cn.leon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Leon
 * @create 2022-04-02 0:56
 * IntelliJ IDEA
 * cn.leon.controller
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String INVOKE_URL = "http://cloud-provider-payment";


    @RequestMapping(value = "/consumer/payment/zk")
    public String paymentzk(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);
        return result;
    }
}
