package com.example.demo;

import com.example.demo.employeeservice;
import com.rabbitmq.client.Return;
import com.example.demo.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.employee;
import com.example.demo.RabbitMQProducer;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/v1/EMPLOYEE")
public class employeecontroller {

    private final employeeservice Employeeservice;

    @Autowired
    public employeecontroller(employeeservice employeeservice) {
        Employeeservice = employeeservice;
    }
    @GetMapping
    public List<employee> getEmployee() {
        return Employeeservice.getemployee();
    }
}

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final RabbitMQProducer producer;

    public EmployeeController(RabbitMQProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public employee createEmployee(@RequestBody employee employee) {
        producer.sendEmployeeToQueue(employee); // Publish to RabbitMQ
        return employee;
    }
}
