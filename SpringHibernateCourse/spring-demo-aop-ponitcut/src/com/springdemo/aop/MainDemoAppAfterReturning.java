package com.springdemo.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.aop.dao.AccountDAO;

public class MainDemoAppAfterReturning {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<String> listNames = theAccountDAO.findNames(false);
		System.out.println("-------------------");
		
		System.out.println("NAMES: "+listNames);
		context.close();
	}

}
