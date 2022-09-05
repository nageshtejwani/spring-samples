package com.sample.code.generator.service;

import java.util.List;

import com.sample.code.generator.entity.Role;
import com.sample.code.generator.model.RoleDTO;

public interface RoleService {

	void saveRole(RoleDTO roleDTO);
	RoleDTO getRole(long id);
	List<RoleDTO> getRoles();
}
