package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping("/test")
	public String sayTest() {
		return "Welcome to Kubernetes Jenkins Demo-xxx Changes";
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "sayHello syed--dsfdfdfdsfdf";
	}
}
