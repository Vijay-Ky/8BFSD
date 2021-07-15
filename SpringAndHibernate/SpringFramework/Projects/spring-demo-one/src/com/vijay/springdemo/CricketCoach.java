package com.vijay.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAdress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAdress) {
		System.out.println("CricketCoach: SetEmailAddress" );
		this.emailAddress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: SetTeam" );
		this.team = team;
	}

	//creating the no-arg constructor
	CricketCoach()
	{
		System.out.println("CricketCoach: inside the no-arg constructor");
	}
	
	//creating a method for setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkouts() {
		return "Practice bowling for 20minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
