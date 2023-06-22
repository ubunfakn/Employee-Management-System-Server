package com.ubunfakn.employeemanagementsystem.service;

import java.util.List;

import com.ubunfakn.employeemanagementsystem.entity.Employee;

public interface EmployeeService {
    
    Employee getEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    boolean deleteEmployeeById(int id);
    List<Employee> getAllEmployees();
}
