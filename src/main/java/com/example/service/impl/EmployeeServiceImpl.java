/*package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = repository.findAll();
		return employees;
	}

	@Override
	public void insertEmployee(Employee employee) {
		repository.save(employee);

	}
}
*/