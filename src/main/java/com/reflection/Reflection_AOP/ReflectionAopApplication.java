package com.reflection.Reflection_AOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.reflection.Reflection_AOP.Service.OrderService;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ReflectionAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReflectionAopApplication.class, args);
	}

}
