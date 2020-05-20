package com.reflection.Reflection_AOP.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reflection.Reflection_AOP.Service.OrderService;
import com.reflection.Reflection_AOP.model.Order;

@RestController
public class OrderController {

		@Autowired
		private OrderService orderService;

		@GetMapping(value = "/add/order")
		public Order addOrder(@RequestParam("orderId") Long orderId, @RequestParam("descr") String descr) {

			return orderService.displayOrder(orderId, descr);

		}
}
