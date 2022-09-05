package com.sample.code.consumer.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Benefit implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7352688495048886884L;
	private BigDecimal grossSalary;
	private BigDecimal bonus;
	private BigDecimal variablePay;
	private BigDecimal netSalary;
	private int esopQuantity;
	private boolean isEsopApplied;
	private boolean isMealCouponApplied;
	private BigDecimal mealCouponQuantity;
	private Insurance inurancePlan;
	public BigDecimal getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(BigDecimal grossSalary) {
		this.grossSalary = grossSalary;
	}
	public BigDecimal getBonus() {
		return bonus;
	}
	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}
	public BigDecimal getVariablePay() {
		return variablePay;
	}
	public void setVariablePay(BigDecimal variablePay) {
		this.variablePay = variablePay;
	}
	public BigDecimal getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(BigDecimal netSalary) {
		this.netSalary = netSalary;
	}
	public int getEsopQuantity() {
		return esopQuantity;
	}
	public void setEsopQuantity(int esopQuantity) {
		this.esopQuantity = esopQuantity;
	}
	public boolean isEsopApplied() {
		return isEsopApplied;
	}
	public void setEsopApplied(boolean isEsopApplied) {
		this.isEsopApplied = isEsopApplied;
	}
	public boolean isMealCouponApplied() {
		return isMealCouponApplied;
	}
	public void setMealCouponApplied(boolean isMealCouponApplied) {
		this.isMealCouponApplied = isMealCouponApplied;
	}
	public BigDecimal getMealCouponQuantity() {
		return mealCouponQuantity;
	}
	public void setMealCouponQuantity(BigDecimal mealCouponQuantity) {
		this.mealCouponQuantity = mealCouponQuantity;
	}
	public Insurance getInurancePlan() {
		return inurancePlan;
	}
	public void setInurancePlan(Insurance inurancePlan) {
		this.inurancePlan = inurancePlan;
	}
	
	@Override
	public String toString() {
		return "Benefit [grossSalary=" + grossSalary + ", bonus=" + bonus + ", variablePay=" + variablePay
				+ ", netSalary=" + netSalary + ", esopQuantity=" + esopQuantity + ", isEsopApplied=" + isEsopApplied
				+ ", isMealCouponApplied=" + isMealCouponApplied + ", mealCouponQuantity=" + mealCouponQuantity
				+ ", inurancePlan=" + inurancePlan + "]";
	}
}
