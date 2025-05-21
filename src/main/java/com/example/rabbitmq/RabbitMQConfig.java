package com.example.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	@Value("${app.queue-name}")
    private String queueName;

    @Bean
    public Queue queue() {
        return QueueBuilder.nonDurable(queueName).build(); // Updated way
    }
}
