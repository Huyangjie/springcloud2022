package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Leon
 * @create 2022-04-01 0:05
 * IntelliJ IDEA
 * cn.leon
 */
@SpringBootApplication
@EnableEurekaClient //注册进eureka
@EnableDiscoveryClient
public class Payment8001Main {

    public static void main(String[] args) {
        SpringApplication.run(Payment8001Main.class, args);
    }
}



