package com.ubunfakn.employeemanagementsystem.service.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubunfakn.employeemanagementsystem.entity.Employee;
import com.ubunfakn.employeemanagementsystem.repository.EmployeeRepository;
import com.ubunfakn.employeemanagementsystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(int id) {
        return this.employeeRepository.findById(id);
    }


    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }


    @Override
    public boolean deleteEmployeeById(int id) {

        boolean result = false;

        try{
            Employee employee = this.employeeRepository.findById(id);
            this.employeeRepository.delete(employee);
            result = true;
        }catch(Exception e){
            e.printStackTrace();
        }

        return result;
    }

    
    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }
    
}
