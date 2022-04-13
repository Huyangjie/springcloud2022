package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Leon
 * @create 2022-04-01 14:52
 * IntelliJ IDEA
 * PACKAGE_NAME
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002Main {

    public static void main(String[] args){
        SpringApplication.run(Eureka7002Main.class, args);
    }


}
