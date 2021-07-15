package com.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());

		//close
		context.close();
	}

}
