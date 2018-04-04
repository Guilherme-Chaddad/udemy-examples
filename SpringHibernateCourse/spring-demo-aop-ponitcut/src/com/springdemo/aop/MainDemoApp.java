package com.springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.aop.dao.AccountDAO;
import com.springdemo.aop.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		theAccountDAO.addAccount();
		System.out.println("-------------------");
		theAccountDAO.getName();
		System.out.println("-------------------");
		theAccountDAO.setName("Name Cool");
		System.out.println("-------------------");
		theMembershipDAO.addMembership();
		System.out.println("-------------------");
		
		context.close();
	}

}
