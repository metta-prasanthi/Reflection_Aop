package com.reflection.Reflection_AOP;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.reflection.Reflection_AOP.model.Order;

@SpringBootTest
public class TestMyAnnotations {

    @Test
    public void TestValidObject() {
    	Order order = new Order(1001L,"LapTop"); 
    	
    	Boolean isValid = order.isValid().equalsIgnoreCase("Valid");

        assertTrue(isValid.booleanValue(), "Is a valid Object");
        System.out.println("OrderId can not be null");
        System.out.println("Order object is valid");
    }
    
    @Test
    public void TestInValidObject() {
    	Order order = new Order(null,"LapTop"); 
    	Boolean isValid = order.isValid().equalsIgnoreCase("Valid Object");

        assertFalse(isValid.booleanValue(), "Is an invalid");
        System.out.println("OrderId can not be null");
    }

}