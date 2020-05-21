package com.reflection.Reflection_AOP;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Test;

import com.reflection.Reflection_AOP.model.Order;

public class TestMyAnnotations extends ReflectionAopApplicationTests{

    @Test
    public void TestValidObject() {
    	Order order = new Order(1001L,"LapTop"); 
    	
        assertEquals(order.isValid(), "Valid");
        System.out.println("Order object is valid");
    }
    
    @Test
    public void TestInValidObject() {
    	Order order = new Order(null,"LapTop"); 
    	
        assertEquals(order.isValid(), "InValid");
        System.out.println("OrderId can not be null");
    }

}