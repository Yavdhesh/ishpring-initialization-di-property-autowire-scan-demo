package com.luv2code.springdemo.propertySourceConfig;

import org.springframework.beans.factory.annotation.Value;

public class DependentClass {
	
	private IndependentClass independentClass;
	
	
	@Value("${ram.name}")
	private String raamNaam;
	
	
	@Value("${shyam.name}")
	private String shyamNaam;
	
	
	public DependentClass(IndependentClass independentClass){
		this.independentClass=independentClass;
	}
	
	public void printKaro(){
		System.out.println("isi kilass ki raamNaam = "+raamNaam+", shyamNaam = "+shyamNaam);
		independentClass.printKaro();
	}

}
