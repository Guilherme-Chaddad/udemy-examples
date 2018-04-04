package com.springdemo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class MyNoGetterSetterAspect {

	@Before("com.springdemo.aop.aspect.AopExpressions.forDaoPackage() || com.springdemo.aop.aspect.AopExpressions.noGetterSetter()")
	public void notGetterOrSetter() {
		System.out.println("No getter or setter");
	}
}
