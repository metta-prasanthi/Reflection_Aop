package com.reflection.Reflection_AOP.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderServiceAspect {
	
	@Before(value = "execution(* com.reflection.Reflection_AOP.Service.OrderService.*(..)) and args(orderId,descr)")
	public void beforeAdvice(JoinPoint joinPoint, Long orderId, String descr) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating order with orderId - " + orderId + " and description - " + descr);
	}

	@After(value = "execution(* com.reflection.Reflection_AOP.Service.OrderService.*(..)) and args(orderId,descr)")
	public void afterAdvice(JoinPoint joinPoint, Long orderId, String descr) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created order with orderId - " + orderId + " and description - " + descr);
	}

}
