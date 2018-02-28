package com.annotations.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

	private FortuneService fortuneService;

	@Value("${prop.email}")
	private String email;
	@Value("${prop.name}")
	private String name;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getFortune() {
		return "Swim Coach "+fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Swim Coach Daily Workout - "+name+ " - "+email;
	}

}
