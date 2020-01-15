package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionImpl implements ConstructorInjectionInterface {

	@Override
	public void counstructorDependencyMethod() {
		
		System.out.println("mai hu construcotr dependency method maay hahahaah");

	}

	@Override
	public void counstructorDependency2() {
		
		System.out.println("mai hu construcotr dependency 2 maay naacho naacho");

	}

}
