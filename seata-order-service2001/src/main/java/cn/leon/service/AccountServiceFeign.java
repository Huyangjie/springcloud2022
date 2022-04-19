package cn.leon.service;

import cn.leon.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Leon
 * @create 2022-04-18 18:33
 * IntelliJ IDEA
 * cn.leon.service
 */
@Component
@FeignClient(value = "SEATA-ACCOUNT-SERVICE")
public interface AccountServiceFeign {
    @RequestMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);
}


