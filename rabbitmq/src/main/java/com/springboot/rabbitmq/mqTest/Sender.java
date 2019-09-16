package com.springboot.rabbitmq.mqTest;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 创建消息发送者
 * @author haochen
 * @date 2019/9/16 17:38
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String msg){
        //消息发送到hello这个消息队列。发送的信息为 msg
        this.amqpTemplate.convertAndSend("hello",msg);
    }

}
