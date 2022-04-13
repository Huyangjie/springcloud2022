package cn.leon.service.impl;

import cn.leon.dao.PaymentMapper;
import cn.leon.entity.Payment;
import cn.leon.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Leon
 * @create 2022-04-01 0:27
 * IntelliJ IDEA
 * cn.leon.service.impl
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;
    @Override
    public int create(Payment payment) {

        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentMapper.getPaymentById(id);
    }
}
