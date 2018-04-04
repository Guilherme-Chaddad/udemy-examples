package com.springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.aop.dao.AccountDAO;

public class MainDemoAppAfter {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		try {
			AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
			
			theAccountDAO.findNames(false);
			
			System.out.println("-------------------");
			
			theAccountDAO.findNames(true);
			
		} catch (RuntimeException ex) {
			System.out.println("Catch");
		}
		context.close();
	}

}
