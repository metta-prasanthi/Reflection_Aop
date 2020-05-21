package com.reflection.Reflection_AOP;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.reflection.Reflection_AOP.model.Order;

@SpringBootTest
public class TestAspectValidation {

    
	@Test
	public void testOrder() {
		Order order = new Order(1001L,"LapTop");

		assertNotNull(order);
		assertEquals(order.getOrderId(), 1001L);
		assertEquals(order.getDescr(), "LapTop");
	}
	
	
}

    

