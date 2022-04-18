package cn.leon.service.impl;

import cn.leon.mapper.StorageMapper;
import cn.leon.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Leon
 * @create 2022-04-18 17:43
 * IntelliJ IDEA
 * cn.leon.service.impl
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    @Override
    public int decrease(Long productId, Integer count) {
        return storageMapper.decrease(productId, count);
    }
}
