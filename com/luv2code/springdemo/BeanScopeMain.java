package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-applicationContext.xml");
		
		RandomSamkhya sd =context.getBean("ekal", RandomSamkhya.class);
		
		RandomSamkhya jd=context.getBean("ekal", RandomSamkhya.class);
		
		if(sd.hashCode()==jd.hashCode()){
			System.out.println("BHaaiyo ek hi hai");
		}
		
		RandomSamkhya pd1=context.getBean("asamkhya", RandomSamkhya.class);
		
		RandomSamkhya pd2=context.getBean("asamkhya", RandomSamkhya.class);

		
		if(pd1.hashCode()==pd2.hashCode()){
			System.out.println("BHaaiyo ek hi hai");
		}
		
		
		context.close();
	}

}
