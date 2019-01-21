package com.mqDemo.mq.RabbitMQDelay;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.time.LocalDateTime;

@Component
public class MessageReceiver {

	@RabbitListener(queues = { RabbitConfig.REGISTER_QUEUE_NAME })
	public void listenerDelayQueue(String msg, Message message, Channel channel) {
		System.out.println(String.format("[listenerDelayQueue 监听的消息] - [消费时间] - [%s] - [%s]", LocalDateTime.now(), msg.toString()));
		try {
			// TODO 通知 MQ 消息已被成功消费,可以ACK了
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
		} catch (IOException e) {
			// TODO 如果报错了,那么我们可以进行容错处理,比如转移当前消息进入其它队列
		}
	}
}