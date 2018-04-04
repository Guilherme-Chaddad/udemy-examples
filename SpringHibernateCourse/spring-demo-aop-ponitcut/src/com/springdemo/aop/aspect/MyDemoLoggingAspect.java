package com.springdemo.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(37)
public class MyDemoLoggingAspect {
	
	@After("execution(* com.springdemo.aop.dao.AccountDAO.findNames(..))")
	public void after(JoinPoint theJoinPoint) {
		System.out.println("After");

		System.out.println("-------------------");
		System.out.println(theJoinPoint.getSignature());
	}
	
	@AfterReturning(pointcut="execution(* com.springdemo.aop.dao.AccountDAO.findNames(..))",
					returning="names")
	public void afterReturning(JoinPoint theJoinPoint, List<String> names) {
		System.out.println("After Returning");

		System.out.println("-------------------");
		System.out.println(theJoinPoint.getSignature());

		System.out.println("-------------------");
		System.out.println(names);
		
		names.add(0, "First");
	}
	
	@AfterThrowing(pointcut="execution(* com.springdemo.aop.dao.AccountDAO.findNames(..))",
					throwing="exception")
	public void afterThrowing(JoinPoint theJoinPoint, Throwable exception) {
		System.out.println("After Throwing");

		System.out.println("-------------------");
		System.out.println(theJoinPoint.getSignature());

		System.out.println("-------------------");
		System.out.println(exception);
	}
	
	@Before("com.springdemo.aop.aspect.AopExpressions.forDaoPackage()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("Before Aspect");
		
		System.out.println(theJoinPoint.getSignature());
		
		for(Object arg : theJoinPoint.getArgs())
			System.out.println("Arg: "+arg);
	}
}
