package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Leon
 * @create 2022-04-10 17:37
 * IntelliJ IDEA
 * cn.leon
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPayment9003 {
    
    public static void main(String[] args){
        SpringApplication.run(NacosPayment9003.class, args);
    }
}
