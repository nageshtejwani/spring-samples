package com.sample.code.consumer.model;

import java.io.Serializable;

public class Insurance implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6144038472344787481L;
	private String plan;
	private int limit;
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "Insurance [plan=" + plan + ", limit=" + limit + "]";
	}
}
