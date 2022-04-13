package cn.leon.service;

import org.springframework.stereotype.Component;

/**
 * @author Leon
 * @create 2022-04-06 16:45
 * IntelliJ IDEA
 * cn.leon.service
 */
@Component
public class PaymentServiceFb implements PaymentService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "稍后请重试";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "稍后请重试";
    }
}
