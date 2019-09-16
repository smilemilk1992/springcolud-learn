package com.springboot.rabbitmq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;


/**
 * 创建消息队列
 * @author haochen
 * @date 2019/9/16 17:36
 */
@Configuration
public class QueueConfig {
    @Bean
    public Queue createQueue(){
        return new Queue("hello");
    }
}
