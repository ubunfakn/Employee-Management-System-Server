package com.ubunfakn.employeemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    @Column(unique=true)
    private String email;
    @Column(unique=true)
    private String mobile;
    private String department;
    private double salary;
}
