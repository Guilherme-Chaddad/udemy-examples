package com.annotations.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.annotations.demo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService getFortuneService() {
		return new FortuneServiceImpl();
	}

	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(getFortuneService());
	}
}
