package com.chetan.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
				ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
				//retrieve bean from spring container
				
				Coach theCoach=context.getBean("myCoach",Coach.class); //call from interface
				Coach theCricCoach=context.getBean("myCoach",Coach.class); //call from class 
				
				//call the methods on bean
				System.out.println(theCoach.getDailyWorkout());
				
				//call method for fortune
				System.out.println(theCoach.getFortune());
				//close the context
				context.close();

	}

}
