package com.springboot.rabbitmq;

import com.springboot.rabbitmq.mqTest.MsgSender;
import com.springboot.rabbitmq.mqTest.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {
    @Autowired
    private Sender sender;

    @Autowired
    private MsgSender msgSender;

    @Test
    public void contextLoads() {
    }
    @Test
    public void queueTest() throws InterruptedException {

        while (true){
            Thread.sleep(100);
            sender.send("你好");
        }
    }

    @Test
    public void send1() throws Exception {
        msgSender.send1();
    }

    @Test
    public void send2() throws Exception {
        msgSender.send2();
    }



}
