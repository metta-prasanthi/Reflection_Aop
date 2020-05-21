package com.reflection.Reflection_AOP.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.reflection.Reflection_AOP.model.Order;

@Aspect
@Component
public class OrderServiceAspect {
	
	@Before(value = "execution(* com.reflection.Reflection_AOP.Service.OrderService.*(..)) and args(order)")
	public void beforeAdvice(JoinPoint joinPoint, Order order) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating order with orderId - " + order.getOrderId() + " and description - " + order.getDescr());
	}

	@After(value = "execution(* com.reflection.Reflection_AOP.Service.OrderService.*(..)) and args(order)")
	public void afterAdvice(JoinPoint joinPoint, Order order) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created order with orderId - " + order.getOrderId() + " and description - " + order.getDescr());
	}
}
