package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("configuration.xml");
		
		//retrieve the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach thisCoach = context.getBean("tennisCoach", Coach.class);
		
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());

		boolean result = (theCoach == thisCoach);
		
		System.out.println("memory address of theCoach: " + theCoach);
		System.out.println("memory address of thisCoach: " + thisCoach);
		
		System.out.println("so both are pointing to the same object?: " + result );
		
		//close
		context.close();
	}

}
