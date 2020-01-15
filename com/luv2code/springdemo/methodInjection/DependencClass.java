package com.luv2code.springdemo.methodInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencClass {
	
	private MethodInjectionDependency methodInjectionDependency;
	
	
	@Autowired
	public void methodInjection(MethodInjectionDependency methodInjectionDependency)
	{
		this.methodInjectionDependency=methodInjectionDependency;	
	}
	
	
	public void dikhaaoToSahi(){
		
		this.methodInjectionDependency.methodDependencyMethod();
	}
}
