package com.mqDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mqDemo.mq.RabbitMQ.IMessageProducerService;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestActiveMQ {
    @Autowired
    private IMessageProducerService messageProducer;
    @Test
    public void testSend() throws Exception {
    	this.messageProducer.sendMessage("11111111111111");
    }
}
