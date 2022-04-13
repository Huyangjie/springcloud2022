package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Leon
 * @create 2022-04-01 0:05
 * IntelliJ IDEA
 * cn.leon
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8002Main {

    public static void main(String[] args) {
        SpringApplication.run(Payment8002Main.class, args);
    }
}



