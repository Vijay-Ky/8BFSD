package com.vijay.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//creating the object
		//hard coding
		Coach theCoach = new BaseballCoach();
		
		//Coach theCoach2 = new TrackCoach();
		
		//use the object coach
		System.out.println(theCoach.getDailyWorkouts()); 
		
		//System.out.println(theCoach2.getDailyWorkouts());
	}

}
