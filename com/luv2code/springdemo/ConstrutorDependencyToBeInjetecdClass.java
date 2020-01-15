package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstrutorDependencyToBeInjetecdClass {
	
	
	private ConstructorInjectionInterface constructorInjectionInterface;
	
	@Autowired
	public ConstrutorDependencyToBeInjetecdClass(ConstructorInjectionInterface constructorInjectionInterface){
		this.constructorInjectionInterface=constructorInjectionInterface;
		
		System.out.println("ho gayaa constructor injection"+this.constructorInjectionInterface);
	}
	
	
	public void dependencyDekh(){
		
		constructorInjectionInterface.counstructorDependency2();
		constructorInjectionInterface.counstructorDependencyMethod();
		
	}

}
