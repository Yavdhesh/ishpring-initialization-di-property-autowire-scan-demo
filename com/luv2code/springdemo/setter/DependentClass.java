package com.luv2code.springdemo.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependentClass {
	
	private SetterDependency setterDependency;

	@Autowired
	public void setSetterDependency(SetterDependency setterDependency) {
		this.setterDependency = setterDependency;
	}
	
	
	public void setterDependencyPrint(){
		setterDependency.setterDependency();
	}

}
