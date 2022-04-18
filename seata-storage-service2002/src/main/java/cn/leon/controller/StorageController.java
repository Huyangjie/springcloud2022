package cn.leon.controller;

import cn.leon.entity.CommonResult;
import cn.leon.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Leon
 * @create 2022-04-18 17:58
 * IntelliJ IDEA
 * cn.leon.controller
 */
@RestController
@Slf4j
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {

        int decrease = storageService.decrease(productId, count);

        if (decrease>0){
            return new CommonResult(200, "减少库存",null);
        }

        return new CommonResult(400,null,null);
    }
}
