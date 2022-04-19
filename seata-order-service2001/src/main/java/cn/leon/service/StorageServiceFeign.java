package cn.leon.service;

import cn.leon.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Leon
 * @create 2022-04-18 21:41
 * IntelliJ IDEA
 * cn.leon.service
 */
@Component
@FeignClient(value = "SEATA-STORAGE-SERVICE")
public interface StorageServiceFeign {
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
