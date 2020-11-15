package com.guigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class MySelfRule {
    @Bean
    public IRule myIRule(){
        log.info("采用Ribbon随机的负载均衡方式");
        return new RandomRule();
    }
}
