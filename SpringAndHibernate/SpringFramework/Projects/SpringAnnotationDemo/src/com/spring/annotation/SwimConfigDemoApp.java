package com.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve the bean
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("email:" + theCoach.getEmail());
		
		System.out.println("team:" + theCoach.getTeam());

		//close
		context.close();
	}

}
