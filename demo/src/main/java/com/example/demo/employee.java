package com.example.demo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class employee {
    @Id
    @SequenceGenerator(
            name = "Employee_sequence",
            sequenceName = "Employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Employee_sequence"
    )
    private long id;
    private String name;
    private String email;
    private String department;
    private LocalDate DOE;

    public employee () {
    }

    public employee(long id,
                    String name,
                    String email,
                    String department,
                    LocalDate DOE) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.DOE = DOE;
    }

    public employee(String name,
                    String email,
                    String department,
                    LocalDate DOE) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.DOE = DOE;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDOE() {
        return DOE;
    }

    public void setDOE(LocalDate DOE) {
        this.DOE = DOE;
    }

    @Override
    public String toString() {
        return "EMPLOYEE{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", DOE=" + DOE +
                '}';
    }
}
