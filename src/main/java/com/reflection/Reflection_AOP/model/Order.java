package com.reflection.Reflection_AOP.model;

import java.lang.reflect.Field;

import com.reflection.Reflection_AOP.reflection.NotEmpty;
import com.reflection.Reflection_AOP.reflection.NotNull;

public class Order extends ValidateObject{

	@NotNull
	Long orderId;
	@NotEmpty
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
        	Class<Order> clazz = Order.class;
        	Field[] fields = clazz.getDeclaredFields();
        	
        	//Print all filed names
        	for (Field f : fields ) 
        	System.out.println("Field Name : " + f.getName());
        	
        	//Validate OrderId for null 
        	notNullreturnVal = checkNotNull(fields[0]);
        	notEmptyreturnVal = checkNotEmpty(fields[1]);
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
