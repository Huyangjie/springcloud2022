package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Leon
 * @create 2022-04-01 0:14
 * IntelliJ IDEA
 * cn.leon
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001Main.class, args);
    }
}
