package cn.leon.service;

import cn.leon.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Leon
 * @create 2022-04-01 0:27
 * IntelliJ IDEA
 * cn.leon.service
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
