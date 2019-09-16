package com.springboot.rabbitmq;

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
    @Test
    public void contextLoads() {
    }
    @Test
    public void queueTest() throws InterruptedException {

        while (true){
            Thread.sleep(1000);
            sender.send("你好");
        }
    }


}
