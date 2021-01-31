package com.chetan.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		
		Coach theCoach=context.getBean("CricCoach",CricketCoach.class); //call from interface
		CricketCoach theCricCoach=context.getBean("CricCoach",CricketCoach.class); //call from class 
		
		//call the methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method for fortune
		System.out.println(theCoach.getFortune());
		
		//call get methods
		System.out.println(theCricCoach.getEmailAddress());
		System.out.println(theCricCoach.getTeam());
		
		//close the context
		context.close();
	}

}
