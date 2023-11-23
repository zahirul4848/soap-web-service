package com.springbootsoap.service;

import com.springbootsoap.model.Employee;
import com.springbootsoap.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployeeById (Long employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }
    public void addEmployee (Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee (Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee (Long employeeId) {
        employeeRepository.deleteByEmployeeId(employeeId);
    }
}
