package com.sample.code.generator.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sample.code.generator.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	List<Role> findAll();

}
