package com.vijay.springdemo;

public class TrackCoach implements Coach
{
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkouts()
	{	
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	//init-method
	public void initMethod()
	{
		System.out.println("TrackCoach: " + "initMethod");
	}
	
	
	//destroy-method
	public void destroyMethod()
	{
		System.out.println("TrackCoach: " + "destroyMethod");
	}
	
	
	
	
	
	
	
}
