package com.springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.aop.dao.AccountDAO;

public class MainDemoAppAfterThrowing {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		try {
			AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
			
			theAccountDAO.findNames(true);
			
			System.out.println("-------------------");
			
		} catch (RuntimeException ex) {
			System.out.println("Catch");
		}
		context.close();
	}

}
