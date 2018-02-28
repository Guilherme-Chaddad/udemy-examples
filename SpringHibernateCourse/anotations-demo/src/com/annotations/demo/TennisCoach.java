package com.annotations.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	@Value("${prop.email}")
	private String email;
	@Value("${prop.name}")
	private String name;
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	public String getFortune() {
		return fortuneService.getFortune() +" - "+ email +" - "+ name;
	}
	
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct
	private void init() {
		System.out.println("Initialized");
	}

	@PreDestroy
	private void destroy() {
		System.out.println("Destroyed");
	}
}
