package com.sample.code.consumer.model;

import java.io.Serializable;

public class Secret implements Serializable {

	@Override
	public String toString() {
		return "Secret [key=" + key + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 588973367111350660L;
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
