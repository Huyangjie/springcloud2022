package cn.leon.service.impl;

import cn.leon.mapper.AccountMapper;
import cn.leon.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Leon
 * @create 2022-04-18 18:19
 * IntelliJ IDEA
 * cn.leon.service.impl
 */
@Service

public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;
    @Override
    public int decrease(Long userId, BigDecimal money) {
        return accountMapper.decrease(userId, money);
    }
}
