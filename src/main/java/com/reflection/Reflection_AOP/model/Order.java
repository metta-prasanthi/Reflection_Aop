package com.reflection.Reflection_AOP.model;

import java.lang.reflect.Field;

import com.reflection.Reflection_AOP.reflection.NotEmpty;
import com.reflection.Reflection_AOP.reflection.NotNull;

public class Order extends ValidateObject{

	@NotNull
	@NotEmpty
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
	
	public String isValid() {

        String notNullreturnVal = "InValid";
        String notEmptyreturnVal = "InValid";
        
        try {
        	Field field   = this.getClass().getField("orderId");
        	notNullreturnVal = checkNotNull(field);
        	notEmptyreturnVal = checkNotEmpty(field);
		} catch (Exception e) {
			e.printStackTrace();
		}

        if (notNullreturnVal.equalsIgnoreCase("valid") && notEmptyreturnVal.equalsIgnoreCase("valid")) {
        	System.out.println("This is a valid Object");
        	return "Valid";
        }
        System.out.println("This is an invalid Object");
        return "InValid";
    }
}
