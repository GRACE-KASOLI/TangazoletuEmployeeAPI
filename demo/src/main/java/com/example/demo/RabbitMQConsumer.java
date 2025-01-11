package com.example.demo;

import com.example.demo.employee;
import com.example.demo.EmployeeRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {
    private final EmployeeRepository repository;

    public RabbitMQConsumer(EmployeeRepository repository) {
        this.repository = repository;
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void consumeMessage(employee employee) {
        repository.save(employee);
        System.out.println("Message consumed from RabbitMQ: " + employee);
    }
}
