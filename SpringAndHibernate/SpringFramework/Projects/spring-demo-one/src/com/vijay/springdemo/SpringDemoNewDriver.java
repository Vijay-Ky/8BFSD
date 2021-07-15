package com.vijay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoNewDriver {

	public static void main(String[] args) {
		
		//1.load the configuration file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("configuration.xml");
		
		//retrieve the bean from the spring container
		CricketCoach theCoach = context.getBean("cricketBean", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkouts());
		System.out.println(theCoach.getDailyFortune());
		
		
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());
	}
}
