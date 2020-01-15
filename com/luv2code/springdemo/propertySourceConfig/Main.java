package com.luv2code.springdemo.propertySourceConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationProp.class);

		
		DependentClass d=context.getBean("dependentClass", DependentClass.class);
		
		d.printKaro();
	}

}
