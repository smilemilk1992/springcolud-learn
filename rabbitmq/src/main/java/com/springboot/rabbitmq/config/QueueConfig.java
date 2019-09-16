package com.springboot.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
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
    public Queue createQueue1(){
        return new Queue("hello1");
    }

    @Bean
    public Queue createQueue2(){
        return new Queue("hello2");
    }

    /**
     * 声明一个Topic类型的交换机
     * @return
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("mybootexchange");
    }

    /**
     * 绑定Q到交换机,并且指定routingKey
     * @param createQueue1
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessage(Queue createQueue1, TopicExchange exchange) {
        return BindingBuilder.bind(createQueue1).to(exchange).with("topic.message");
    }

    @Bean
    Binding bindingExchangeMessages(Queue createQueue2, TopicExchange exchange) {
        return BindingBuilder.bind(createQueue2).to(exchange).with("topic.#");
    }

}
