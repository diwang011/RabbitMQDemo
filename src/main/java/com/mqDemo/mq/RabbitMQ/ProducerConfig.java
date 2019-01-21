package com.mqDemo.mq.RabbitMQ;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {
	public static final String QUEUE_NAME = "msgQueue"; // 队列名称

	@Bean
	public Queue queue() { // 要创建的队列信息
		return new Queue(QUEUE_NAME);
	}
}