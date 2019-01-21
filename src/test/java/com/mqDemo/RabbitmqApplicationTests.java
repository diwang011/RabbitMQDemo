package com.mqDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mqDemo.mq.RabbitMQDelay.MessageService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {
  @Autowired
  private MessageService messageService;
  @Test
  public void send() {
    messageService.sendMsg("test1111111111111");
  }
}