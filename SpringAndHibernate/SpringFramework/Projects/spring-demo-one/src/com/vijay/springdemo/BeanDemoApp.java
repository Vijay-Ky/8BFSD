package com.vijay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("beanScope-Configuration.xml");
		
		Coach coach = context.getBean("beanIdCoach", Coach.class);
		
		Coach myCoach = context.getBean("beanIdCoach", Coach.class);
		
		boolean flag = (coach == myCoach);
		
		System.out.println("both are pointing to the same instance?: " + flag);
		
		System.out.println("memory address of coach: " + coach);
		
		System.out.println("memory address of myCoach: " + myCoach);
	}

}
