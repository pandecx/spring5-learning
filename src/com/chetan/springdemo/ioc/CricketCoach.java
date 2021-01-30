package com.chetan.springdemo.ioc;

public class CricketCoach implements Coach {
	//create private field for dependency 
	private FortuneService fortuneService;
	
	//define constructor for class to implement 
	public CricketCoach(FortuneService thefortuneService) {
		fortuneService=thefortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Make 264 runs in next 40 overs";
		
	}

	@Override
	public String getFortune() {
		//use  myfortune service to get fortune 
		return fortuneService.getFortune();
	
	}

}
