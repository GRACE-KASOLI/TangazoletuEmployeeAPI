package com.example.demo;

import com.example.demo.employee;
import com.example.demo.employee;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Service
public class employeeservice {

    public List<employee> getemployee() {
        return List.of(
                new employee(
                        1L, // Fixed lowercase "l" to uppercase "L" for clarity
                        "Mariam",
                        "mariam.j@gmail.com",
                        "Engineering",
                        LocalDate.of(2014, JANUARY, 5)
                )
        );
    }
}