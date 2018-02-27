package com.annotations.demo;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "getFortune Called";
	}

}
