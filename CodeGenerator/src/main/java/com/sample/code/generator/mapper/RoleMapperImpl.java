package com.sample.code.generator.mapper;

import org.springframework.stereotype.Component;

import com.sample.code.generator.entity.Role;
import com.sample.code.generator.model.RoleDTO;

@Component
public class RoleMapperImpl implements RoleMapper {

	@Override
	public RoleDTO entityToDTO(Role role) {
		RoleDTO roleDTO = new RoleDTO();
		roleDTO.setId(role.getId());
		roleDTO .setRole(role.getRoleName());
		roleDTO.setRoleDescription(role.getRoleName());
		return roleDTO;
	}

	@Override
	public Role dtoToEntity(RoleDTO roleDTO) {
		Role role = new Role();
		role.setRoleName(roleDTO.getRole());
		role.setRoleDescription(roleDTO.getRoleDescription());
		return role;
	}

}
