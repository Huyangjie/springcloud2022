package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Leon
 * @create 2022-04-02 21:55
 * IntelliJ IDEA
 * cn.leon
 */
@SpringBootApplication
@EnableCircuitBreaker //开启服务降级（服务端的降级）
@EnableDiscoveryClient
public class PaymentHystrix8001Main {
    
    public static void main(String[] args){
        SpringApplication.run(PaymentHystrix8001Main.class, args);
    }
}
