package com.luv2code.springdemo.setter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterDIMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.luv2code.springdemo.setter");

		DependentClass dependentClass = context.getBean("dependentClass", DependentClass.class);
		dependentClass.setterDependencyPrint();
	
	}

}
