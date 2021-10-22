package com.example.employeeapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @NotBlank(message="is required")
    @Column(name="first_name")
    private String firstName;
    @NotBlank(message="is required")
    @Column(name="last_name")
    private String lastName;
    @NotBlank(message="is required")
    @Email(message = "invalid email")
    private String email;

    @Column(name="salary")
    @NotBlank(message="is required")
    @Min(value=1000, message="minimum salary must be 1000")
    @Max(value=50000, message="maximum salary must be 50000")
    private String salary;
}