package com.chetan.springdemo.ioc;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Just Do it!! - "+fortuneService.getFortune();
	}

}
