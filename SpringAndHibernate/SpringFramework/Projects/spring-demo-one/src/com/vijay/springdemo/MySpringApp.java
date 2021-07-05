package com.vijay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		
		//1. load the spring configuration file
		ClassPathXmlApplicationContext contex = 
				new ClassPathXmlApplicationContext("configuration.xml");
		
		//2. retrieve the bean from the spring container
		Coach theCoach = contex.getBean("beanIdCoach", Coach.class);	
		
		//3. call the method on the bean/object
		System.out.println(theCoach.getDailyWorkouts());
		
		//4. close the context
		contex.close();
	}
}
