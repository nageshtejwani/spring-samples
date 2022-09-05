package com.sample.code.consumer.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Employee  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 738786329972873639L;
	private String name;
	private Gender gender;
	private Date doj;
	private Role role;
	private Benefit benefit;
	private List<Depndent> dependents;
	private Secret secret;
	public Secret getSecret() {
		return secret;
	}
	public void setSecret(Secret secret) {
		this.secret = secret;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Benefit getBenefit() {
		return benefit;
	}
	public void setBenefit(Benefit benefit) {
		this.benefit = benefit;
	}
	public List<Depndent> getDependents() {
		return dependents;
	}
	public void setDependents(List<Depndent> dependents) {
		this.dependents = dependents;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", doj=" + doj + ", role=" + role + ", benefit="
				+ benefit + ", dependents=" + dependents + ", secret=" + secret + "]";
	}

}
