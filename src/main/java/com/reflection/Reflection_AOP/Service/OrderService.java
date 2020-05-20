package com.reflection.Reflection_AOP.Service;

import org.springframework.stereotype.Service;

import com.reflection.Reflection_AOP.model.Order;

@Service
public class OrderService {

	public Order displayOrder(Long orderId, String descr) {

		Order order = new Order(orderId, descr);
		return order;
	}
}
