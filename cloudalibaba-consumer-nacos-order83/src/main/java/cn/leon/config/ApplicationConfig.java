package cn.leon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Leon
 * @create 2022-04-10 23:02
 * IntelliJ IDEA
 * cn.leon.config
 */
@Configuration
public class ApplicationConfig {

    @Bean
    @LoadBalanced
    public RestTemplate get(){
        return new RestTemplate();
    }
}
