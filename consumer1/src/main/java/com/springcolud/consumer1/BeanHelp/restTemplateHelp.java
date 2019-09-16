package com.springcolud.consumer1.BeanHelp;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author haochen
 * @date 2019/9/16 10:08
 * Configuration @Configuration中所有带@Bean注解的方法都会被动态代理，调用该方法返回的都是同一个实例。
 * @Component 注解并没有通过cglib来代理@Bean方法的调用，因此调用带@Bean注解的方法态返回的都是新的实例。
 */
@Configuration
public class restTemplateHelp {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
