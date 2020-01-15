package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDependencyMain {
	
	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext-constrcutorDependency.xml");
		
		ConstrutorDependencyToBeInjetecdClass construtorDependencyToBeInjetecdClass =context.getBean("construtorDependencyToBeInjetecdClass", ConstrutorDependencyToBeInjetecdClass.class);

		construtorDependencyToBeInjetecdClass.dependencyDekh();
		
	}

}
