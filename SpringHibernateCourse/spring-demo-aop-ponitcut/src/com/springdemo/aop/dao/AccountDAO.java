package com.springdemo.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	private String name;
	
	public List<String> findNames(boolean throwException){
		if(throwException)
			throw new RuntimeException("Kabumm");
		
		List<String> list = new ArrayList<>();
		
		list.add("Teste");
		list.add("Teste2");
		
		return list;
	}
	
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
	
	@Override
	public String toString() {
		return name;
	}
}
