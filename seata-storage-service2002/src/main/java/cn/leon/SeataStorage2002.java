package cn.leon;

import cn.leon.config.DataSourceProxyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Leon
 * @create 2022-04-18 17:36
 * IntelliJ IDEA
 * cn.leon
 */
//@SpringBootApplication(exclude = DataSourceProxyConfig.class)
@SpringBootApplication
@EnableDiscoveryClient
public class SeataStorage2002 {
    public static void main(String[] args){
        SpringApplication.run(SeataStorage2002.class, args);
    }
}
