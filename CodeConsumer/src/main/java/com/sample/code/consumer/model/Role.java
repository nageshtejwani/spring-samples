package com.sample.code.consumer.model;

import java.io.Serializable;

public class Role implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2054814509302228602L;
	private String role;
	private String description;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Role [role=" + role + ", description=" + description + "]";
	}
}
