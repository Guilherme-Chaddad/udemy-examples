package com.springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.aop.service.TrafficFortuneService;

public class MainDemoAppAround {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		try {
			TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
			
			System.out.println(trafficFortuneService.getFortune());
			
			System.out.println("-------------------");
			
		} catch (RuntimeException ex) {
			System.out.println("Catch");
		}
		context.close();
	}

}
