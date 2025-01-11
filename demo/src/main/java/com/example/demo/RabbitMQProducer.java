package com.example.demo;

import com.example.demo.RabbitMQConfig;
import com.example.demo.employee;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

    @Service
    public class RabbitMQProducer {
        private final RabbitTemplate rabbitTemplate;

        public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
            this.rabbitTemplate = rabbitTemplate;
        }

        public void sendEmployeeToQueue(employee employee) {
            rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME, employee);
            System.out.println("Message sent to RabbitMQ: " + employee);
        }
    }
