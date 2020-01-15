package com.luv2code.springdemo.methodInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MethodInjectionMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.luv2code.springdemo.methodInjection");
		
		DependencClass clas=context.getBean("dependencClass",DependencClass.class);
		
		clas.dikhaaoToSahi();
		
	}

}
