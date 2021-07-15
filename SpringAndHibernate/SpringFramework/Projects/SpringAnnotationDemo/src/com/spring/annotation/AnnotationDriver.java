package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDriver {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("configuration.xml");
		
		//retrieve the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());

		//close
		context.close();
	}

}
