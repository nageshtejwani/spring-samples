package com.sample.code.consumer.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.code.consumer.model.Employee;
import com.sample.code.consumer.service.EmployeeService;


@RestController
public class EmployeeController {
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	private final EmployeeService employeeService;
	
	@PostMapping(path = "role", 
    consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createRole(@RequestBody Employee employee) {
		employeeService.saveEmployeeDetails(employee);
	}


}
