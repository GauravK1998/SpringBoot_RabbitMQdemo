package com.example.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Value("${app.queue-name}")
    private String queueName;

    @Autowired
    private AmqpTemplate amqpTemplate;

    public String sendMessage(String message) {
        amqpTemplate.convertAndSend(queueName, message);
        return "Message sent: " + message;
    }
}