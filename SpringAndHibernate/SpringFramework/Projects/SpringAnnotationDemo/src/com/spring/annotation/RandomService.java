package com.spring.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	

	private String[] data = {
			"Good Habits Makes Good Outcomes",
			"Practice is the key to mastery",
			"Consistency gets to success"
			};
	
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String myFortune = data[index];
		return myFortune;
	}
	
	
	
}
