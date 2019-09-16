package com.springboot.rabbitmq.mqTest;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author haochen
 * @date 2019/9/16 19:40
 */
@Component
public class MsgReceiver {

    @RabbitListener(queues="hello1")
    public void process(String msg){
        System.out.println("--hello1-"+msg);
    }

    @RabbitListener(queues="hello2")
    public void process1(String msg){
        System.out.println("--hello2-"+msg);
    }
}
