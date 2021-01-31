package com.chetan.springdemo.ioc;

public class CricketCoach implements Coach {
	
	
	//literal for team 
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter method - setEmail");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter method - setTeam");
		this.team = team;
	}

	//create private field for dependency 
	private FortuneService fortuneService;
	
	/*
	 * //define constructor for class to implement public
	 * CricketCoach(FortuneService thefortuneService) {
	 * fortuneService=thefortuneService; }
	 */
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("Inside no-arg constructor");
	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method - setFortune");
		this.fortuneService = fortuneService;
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
