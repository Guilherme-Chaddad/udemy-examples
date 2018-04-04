package com.springdemo.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(37)
public class MyDemoLoggingAspect {
	
	@Before("com.springdemo.aop.aspect.AopExpressions.forDaoPackage()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("Before Aspect");
		
		System.out.println(theJoinPoint.getSignature());
		
		for(Object arg : theJoinPoint.getArgs())
			System.out.println("Arg: "+arg);
	}
}
