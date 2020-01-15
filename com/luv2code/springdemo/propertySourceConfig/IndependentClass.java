package com.luv2code.springdemo.propertySourceConfig;

import org.springframework.beans.factory.annotation.Value;

public class IndependentClass {
	
	@Value("${naam}")
	private String naam;
	
	@Value("${naam2}")
	private String naam2;
	
	
	public void printKaro(){
		System.out.println("Independetclas ki naam = "+naam+" , naam2 =  "+naam2);
	}

}
