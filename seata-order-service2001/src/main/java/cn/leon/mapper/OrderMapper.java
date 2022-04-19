package cn.leon.mapper;

import cn.leon.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.aspectj.weaver.ast.Or;

/**
 * @author Leon
 * @create 2022-04-18 17:17
 * IntelliJ IDEA
 * cn.leon.mapper
 */
@Mapper
public interface OrderMapper {


    int createOrder(Order order);


    int update(@Param("userId") Long userId, @Param("status") Integer status);

}
