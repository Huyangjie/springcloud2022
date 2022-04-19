package cn.leon.impl;

import cn.leon.entity.CommonResult;
import cn.leon.entity.Order;
import cn.leon.mapper.OrderMapper;
import cn.leon.service.AccountServiceFeign;
import cn.leon.service.OrderService;
import cn.leon.service.StorageServiceFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Leon
 * @create 2022-04-18 21:45
 * IntelliJ IDEA
 * cn.leon.impl
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private StorageServiceFeign storageServiceFeign;

    @Resource
    private AccountServiceFeign accountServiceFeign;


    @Override
    public void createOrder(Order order) {


        //创建订单
        orderMapper.createOrder(order);


//        改库存
        CommonResult decrease = storageServiceFeign.decrease(order.getProductId(), order.getCount());
        log.info("storageServiceFeign.decrease===============" + decrease);


//        改账户
        CommonResult decrease1 = accountServiceFeign.decrease(order.getUserId(), order.getMoney());
        log.info("accountServiceFeign.decrease===============" + decrease1);

//        修改订单状态
        int update = orderMapper.update(order.getUserId(), 0);
        log.info("orderMapper.update===============" + update);

    }
}
