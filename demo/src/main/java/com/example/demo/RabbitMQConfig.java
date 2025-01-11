package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class RabbitMQConfig {
        public static final String QUEUE_NAME = "employeeQueue";

        @Bean
        public Queue employeeQueue() {
            return new Queue(QUEUE_NAME, true); // durable queue
        }
    }
