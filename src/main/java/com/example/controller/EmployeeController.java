package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	@GetMapping("/test")
	public String sayTest() {
		return "Welcome to Kubernetes Jenkins Demo-xxx Changes";
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "sayHello syed--dsfdfdfdsfdf";
	}
	
	@GetMapping("/employees")
	public String getAllStudents() {
		return "all Employees";

	}
	@GetMapping("/employees")
	public List<Employee> getEmployees() {

		return empService.getAllEmployees();

	}

	@GetMapping("/insertemployee")
	public void insertEmployee(@RequestBody Employee employee) {
		empService.insertEmployee(employee);
	}
}
