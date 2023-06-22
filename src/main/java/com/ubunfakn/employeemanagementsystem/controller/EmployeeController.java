package com.ubunfakn.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.ubunfakn.employeemanagementsystem.entity.Employee;
import com.ubunfakn.employeemanagementsystem.service.EmployeeService;

@CrossOrigin("*")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(this.employeeService.getAllEmployees());
    }

    @GetMapping("/getemp/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return this.employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable("id") int id) {
        return ResponseEntity.ok(this.employeeService.deleteEmployeeById(id));
    }

    @PostMapping("/add_employee")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
        employee = this.employeeService.saveEmployee(employee);
        if (employee == null) {
            return ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return ResponseEntity.ok(HttpStatus.CREATED);
        }
    }

    // @GetMapping("/save")
    // @ResponseBody
    // public String save(Employee employee){
    // employee.setDepartment("Development");
    // employee.setGender("Male");
    // employee.setEmail("ankit2003nashine@gmail.com");
    // employee.setMobile("8602185525");
    // employee.setName("ANKIT KUMAR NASHINE");
    // employee.setSalary(15000.00);

    // this.employeeService.saveEmployee(employee);
    // return "ok";
    // }
}
