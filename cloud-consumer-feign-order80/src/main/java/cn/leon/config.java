package cn.leon;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author Leon
 * @create 2022-04-02 19:58
 * IntelliJ IDEA
 * cn.leon
 */
@Configuration
public class config {


    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
