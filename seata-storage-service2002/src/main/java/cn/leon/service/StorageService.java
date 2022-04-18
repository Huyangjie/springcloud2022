package cn.leon.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author Leon
 * @create 2022-04-18 17:43
 * IntelliJ IDEA
 * cn.leon
 */
public interface StorageService {
    //减少库存
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
