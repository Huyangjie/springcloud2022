package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Leon
 * @create 2022-04-10 18:21
 * IntelliJ IDEA
 * PACKAGE_NAME
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacos83 {
    public static void main(String[] args){
        SpringApplication.run(OrderNacos83.class, args);
    }
}
