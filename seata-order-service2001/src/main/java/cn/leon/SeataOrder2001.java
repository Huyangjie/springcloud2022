package cn.leon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Leon
 * @create 2022-04-18 17:14
 * IntelliJ IDEA
 * cn.leon
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan(value = "cn.leon.mapper")
public class SeataOrder2001 {
    
    public static void main(String[] args){
        SpringApplication.run(SeataOrder2001.class, args);
    }
}
