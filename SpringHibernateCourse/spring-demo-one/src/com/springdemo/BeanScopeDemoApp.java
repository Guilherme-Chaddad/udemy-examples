package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(myCoach == alphaCoach);

		Coach myCoach2 = context.getBean("myCoach2", Coach.class);
		Coach alphaCoach2 = context.getBean("myCoach2", Coach.class);
		
		System.out.println(myCoach2 == alphaCoach2);
		
		context.close();
	}

}
