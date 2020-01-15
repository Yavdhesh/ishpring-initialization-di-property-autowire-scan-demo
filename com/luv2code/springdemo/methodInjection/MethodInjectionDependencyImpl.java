package com.luv2code.springdemo.methodInjection;

import org.springframework.stereotype.Component;

@Component
public class MethodInjectionDependencyImpl implements MethodInjectionDependency {

	@Override
	public void methodDependencyMethod() {
		
		System.out.println("method par dependency gusednaa safal hui");
		
	}

}
