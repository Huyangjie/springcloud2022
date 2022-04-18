package cn.leon.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Leon
 * @create 2022-04-18 18:15
 * IntelliJ IDEA
 * cn.leon
 */
@Mapper
public interface AccountMapper {
    /**
     * 扣减账户余额
     */
    int decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
