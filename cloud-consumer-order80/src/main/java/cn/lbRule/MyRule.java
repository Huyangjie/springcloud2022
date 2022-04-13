package cn.lbRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Leon
 * @create 2022-04-02 15:50
 * IntelliJ IDEA
 * cn.lbRule
 */
@Configuration
public class MyRule {
    @Bean
    public IRule getRule(){
        return new RandomRule();
    }

}
