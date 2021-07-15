package com.spring.annotation;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your bad day!";
	}

}
