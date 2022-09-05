package com.sample.code.generator.mapper;

import com.sample.code.generator.entity.Role;
import com.sample.code.generator.model.RoleDTO;

public interface RoleMapper {

	RoleDTO entityToDTO(Role role);
	Role dtoToEntity(RoleDTO roleDTO);
}
