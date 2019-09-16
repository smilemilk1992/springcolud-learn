package com.springboot.rabbitmq.mqTest;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接收者
 * @author haochen
 * @date 2019/9/16 17:38
 */
@Component
public class Receiver {
    //    创建消息监听器
    @RabbitListener(queues="hello")
    public void process(String msg){
        System.out.println("---"+msg);
    }
}
