package com.springdemo.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	private String name;
	
	public void addAccount() {
		System.out.println(getClass()+" Add Account Method");
	}

	public String getName() {
		System.out.println(getClass()+" Getter");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass()+" Setter");
		this.name = name;
	}
}
