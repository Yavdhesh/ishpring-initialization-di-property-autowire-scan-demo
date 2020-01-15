package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionUsingComponentScanMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("getter-constr-field-injection-autowire-compscan-applicationContext.xml");

	}

}
