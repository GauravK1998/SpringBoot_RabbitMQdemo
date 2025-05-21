package com.example.rabbitmq.listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @Value("${app.queue-name}")
    private String queueName;

    @RabbitListener(queues = "${app.queue-name}")
    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
    }
}
