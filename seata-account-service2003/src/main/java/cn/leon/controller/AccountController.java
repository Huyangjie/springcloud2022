package cn.leon.controller;

import cn.leon.entity.CommonResult;
import cn.leon.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Leon
 * @create 2022-04-18 18:22
 * IntelliJ IDEA
 * cn.leon.controller
 */
@RestController
@Slf4j
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(Long userId, BigDecimal money) {

        int decrease = accountService.decrease(userId, money);
        if (decrease>0){
            return new CommonResult(200, "减少账户成功", null);

        }
        return new CommonResult(400, null, null);
    }
}
