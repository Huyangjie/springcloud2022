package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Leon
 * @create 2022-04-18 18:13
 * IntelliJ IDEA
 * cn.leon
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
public class SeataAccount2003 {
    public static void main(String[] args){
        SpringApplication.run(SeataAccount2003.class, args);
    }
}
