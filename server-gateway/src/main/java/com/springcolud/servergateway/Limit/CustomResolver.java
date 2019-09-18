package com.springcolud.servergateway.Limit;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @author haochen
 * @date 2019/9/18 19:47
 */
@Configuration
public class CustomResolver {
    @Bean
    public KeyResolver ipKeyResolver(){
        System.out.println("##############ipKeyResolver########################");
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
