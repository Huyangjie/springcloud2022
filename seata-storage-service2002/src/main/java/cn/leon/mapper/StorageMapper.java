package cn.leon.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Leon
 * @create 2022-04-18 17:38
 * IntelliJ IDEA
 * cn.leon
 */
@Mapper
public interface StorageMapper {

    //减少库存
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);

}


