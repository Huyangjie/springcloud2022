package cn.leon.controller;

import cn.leon.entity.CommonResult;
import cn.leon.entity.Order;
import cn.leon.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Leon
 * @create 2022-04-18 23:11
 * IntelliJ IDEA
 * cn.leon.controller
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/order/create")
    public CommonResult create(Order order){
        orderService.createOrder(order);

            return new CommonResult(200, "订单创建成功!");

    }
}
