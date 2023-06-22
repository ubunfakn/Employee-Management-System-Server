package com.ubunfakn.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubunfakn.employeemanagementsystem.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
    Employee findById(int id);
}
