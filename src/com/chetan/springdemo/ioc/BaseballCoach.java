package com.chetan.springdemo.ioc;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println("Inside no-arg constructor");
	}
	
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
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method - setFortune");
		this.fortuneService = fortuneService;
	}

	//add a init method
	public void myInitMethod() {
		System.out.println("Inside my init method");
	}
	
	//add a destroy method
		public void myDestroyMethod() {
			System.out.println("Inside my Destroy method");
		}
		
}
