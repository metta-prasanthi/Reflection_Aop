package com.reflection.Reflection_AOP;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import com.reflection.Reflection_AOP.model.Order;

public class TestAspectValidation extends ReflectionAopApplicationTests{

    
	@Test
	public void testOrder() {
		Order order = new Order(1001L,"LapTop");

		assertNotNull(order);
		assertEquals(order.getOrderId(), 1001L);
		assertEquals(order.getDescr(), "LapTop");
	}
	
	
}

    

