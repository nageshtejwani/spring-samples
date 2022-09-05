package com.sample.code.generator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="ROLE_DESCRIPTION")
	private String roleDescription;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public long getId() {
		return id;
	}

}
