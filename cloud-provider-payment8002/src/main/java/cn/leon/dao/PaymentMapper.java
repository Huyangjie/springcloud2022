package cn.leon.dao;

import cn.leon.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Leon
 * @create 2022-04-01 0:22
 * IntelliJ IDEA
 * cn.leon.dao
 */
@Mapper
public interface PaymentMapper {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
