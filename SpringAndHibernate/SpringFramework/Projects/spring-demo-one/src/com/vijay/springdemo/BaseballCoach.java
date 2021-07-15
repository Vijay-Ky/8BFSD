package com.vijay.springdemo;

public class BaseballCoach implements Coach{

//	BaseballCoach()
//	{
//		
//	}
	//1. define a private field for dependency
	private FortuneService fortuneService;
	
	//2. define a constructor for DI
	public BaseballCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkouts()
	{
		return "spend 30min for batting practice";
	}

	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
