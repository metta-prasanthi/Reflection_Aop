package com.reflection.Reflection_AOP.Service;

import org.springframework.stereotype.Service;

import com.reflection.Reflection_AOP.model.Order;

@Service
public class OrderService {

	public Order createOrder(Order order) {
		return order;
	}
	
	public Order getOrder(Long id) {

		Order order1 = new Order(id, "LapTop");
		System.out.println("Id : " + order1.getOrderId() + " Description : " + order1.getDescr());
		return order1;
	}

}
