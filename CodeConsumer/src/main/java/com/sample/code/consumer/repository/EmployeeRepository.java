package com.sample.code.consumer.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.code.consumer.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
