package com.reflection.Reflection_AOP.model;

public class Order {

	Long orderId;
	String descr;
	
	public Order() {
	}

	public Order(Long orderId, String descr) {
		this.orderId = orderId;
		this.descr = descr;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}	
}
