package cn.leon.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Leon
 * @create 2022-04-18 18:18
 * IntelliJ IDEA
 * cn.leon.service
 */
public interface AccountService {
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    int decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
