package com.sample.code.generator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.code.generator.entity.Role;
import com.sample.code.generator.mapper.RoleMapper;
import com.sample.code.generator.model.RoleDTO;
import com.sample.code.generator.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	private final RoleRepository rolesRepository;
	private final RoleMapper roleMapper;

	public RoleServiceImpl(RoleRepository rolesRepository, RoleMapper roleMapper) {
		super();
		this.rolesRepository = rolesRepository;
		this.roleMapper = roleMapper;
	}

	@Override
	public void saveRole(RoleDTO roleDTO) {
		rolesRepository.save(roleMapper.dtoToEntity(roleDTO));

	}

	@Override
	public RoleDTO getRole(long id) {
		return roleMapper.entityToDTO(rolesRepository.findById(id).get());
	}

	@Override
	public List<RoleDTO> getRoles() {
		List<Role> roles =  rolesRepository.findAll();
		List<RoleDTO> rolesList = new ArrayList<>();
		for(Role role:roles) {
			rolesList.add(roleMapper.entityToDTO(role));
		}
		return rolesList;
	}

}
