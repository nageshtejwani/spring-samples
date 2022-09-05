package com.sample.code.generator.model;

import java.io.Serializable;

public class RoleDTO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3664600280020350781L;
	private long id;
	private String role;
	private String roleDescription;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
}
