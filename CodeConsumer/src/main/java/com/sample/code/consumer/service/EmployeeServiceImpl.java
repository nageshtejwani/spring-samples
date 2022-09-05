package com.sample.code.consumer.service;

import org.springframework.web.client.RestTemplate;

import com.sample.code.consumer.model.Employee;
import com.sample.code.consumer.model.Secret;
import com.sample.code.consumer.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void saveEmployeeDetails(Employee employee) {
		
		RestTemplate restTemplate = new RestTemplate();
		String secretToken = restTemplate.getForObject("http://localhost:18081/secretcode",  String.class);
		Secret secret = new Secret();
		secret.setKey(secretToken);
		employee.setSecret(secret);
		com.sample.code.consumer.entity.Employee employeeEntity  = new com.sample.code.consumer.entity.Employee();
		employeeEntity.setContent(employee.toString());
		employeeRepository.save(employeeEntity);
		
	}

}
