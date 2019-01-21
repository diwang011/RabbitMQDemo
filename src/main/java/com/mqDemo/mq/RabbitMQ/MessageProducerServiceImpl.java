package com.mqDemo.mq.RabbitMQ;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducerServiceImpl implements IMessageProducerService {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void sendMessage(String order) {
		this.rabbitTemplate.convertAndSend(ProducerConfig.QUEUE_NAME, order);
	}

}