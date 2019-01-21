package com.mqDemo.mq.RabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {
	@RabbitListener(queues = "msgQueue")
	public void receiveMessage(String order) { // 进行消息接收处理
		System.err.println("--------------【*** 接收消息 ***】" + order);
	}
}