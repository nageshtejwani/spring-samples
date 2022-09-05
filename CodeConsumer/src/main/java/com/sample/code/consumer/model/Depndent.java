package com.sample.code.consumer.model;

import java.io.Serializable;
import java.util.Date;

public class Depndent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4998840444054704092L;
	private String name;
	private Date age;
	private RelationShip relationship;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getAge() {
		return age;
	}
	public void setAge(Date age) {
		this.age = age;
	}
	public RelationShip getRelationship() {
		return relationship;
	}
	public void setRelationship(RelationShip relationship) {
		this.relationship = relationship;
	}
	
	@Override
	public String toString() {
		return "Depndent [name=" + name + ", age=" + age + ", relationship=" + relationship + "]";
	}

}
