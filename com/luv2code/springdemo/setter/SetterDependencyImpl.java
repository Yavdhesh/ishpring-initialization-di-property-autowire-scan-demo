package com.luv2code.springdemo.setter;

import org.springframework.stereotype.Component;

@Component
public class SetterDependencyImpl implements SetterDependency {

	@Override
	public void setterDependency() {
		System.out.println("Naacho saitter injacsion ho gayaa");

	}

}
