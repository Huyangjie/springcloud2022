package cn.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Leon
 * @create 2022-04-10 16:14
 * IntelliJ IDEA
 * cn.leon
 */
@SpringBootApplication
@EnableDiscoveryClient  //启用发现客户端
public class NacosPayment9001 {
    
    public static void main(String[] args){
        SpringApplication.run(NacosPayment9001.class, args);
    }
}
