package com.vijay.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkouts()
	{
		return "spend 30min for batting practice";
	}
}
