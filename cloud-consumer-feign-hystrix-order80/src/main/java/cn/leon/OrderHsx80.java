package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Leon
 * @create 2022-04-06 16:29
 * IntelliJ IDEA
 * cn.leon
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHsx80 {
    public static void main(String[] args){
        SpringApplication.run(OrderHsx80.class, args);
    }
}
