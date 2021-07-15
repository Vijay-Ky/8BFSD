package com.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	public TennisCoach() {
		System.out.println("TennisCoach: Constructor");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("from the TennisCoach: setFortuneService");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void doSomeStuff(FortuneService fortuneService)
//	{
//		System.out.println("from TennisCoach: doSomeStuff");
//		this.fortuneService = fortuneService;
//	}
	
	@PostConstruct
	public void doStartupStuff()
	{
		System.out.println("TennisCoach: Inside doStartupStuff");
	}
	
	@PreDestroy
	public void doCleanupStuff()
	{
		System.out.println("TennisCoach: Inside doCleanupStuff");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice Defence for 1hr";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
