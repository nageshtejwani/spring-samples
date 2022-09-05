package com.sample.code.consumer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;
	
	

	@Column(name="CONTENT")
	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


}
