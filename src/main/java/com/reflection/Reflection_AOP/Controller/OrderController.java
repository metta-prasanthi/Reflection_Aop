package com.reflection.Reflection_AOP.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reflection.Reflection_AOP.Service.OrderService;
import com.reflection.Reflection_AOP.model.Order;

//Try merging from Release branch
//Try adding new comment on Release after pushing to feature
@RestController
public class OrderController {

		@Autowired
		private OrderService orderService;
		
		@RequestMapping("/getOrderById/{id}")
		public Order getUserByFirstName(@PathVariable Long id) {
			return orderService.getOrder(id);
		}

		@PostMapping(value="/save")
		public Order createOrder(@RequestBody Order order) {
			 return orderService.createOrder(order);
		}

}
