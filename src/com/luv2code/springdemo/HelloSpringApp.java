package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach dsd= context.getBean("myCoach", Coach.class);
		
		if(dsd.hashCode()==theCoach.hashCode()){
			System.out.println("haa bhaai, ek hi class hai");
		}
		
		FortuneService fd= context.getBean("myFortuneService", FortuneService.class);
		
		System.out.println(fd.getFortune());
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}







