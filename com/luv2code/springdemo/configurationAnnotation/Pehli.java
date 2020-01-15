package com.luv2code.springdemo.configurationAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pehli {
	
	
	@PostConstruct
	public void postCon(){
		System.out.println("pehli kaa postcon");
	}
	
	
	@PreDestroy
	public void predest(){
		System.out.println("pehli kaa pre dest");
	}
	
	
	public void aiseHi(){
		System.out.println("aise Hi Pehli ro");
	}

}
