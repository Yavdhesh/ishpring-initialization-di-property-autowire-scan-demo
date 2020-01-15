package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ConstrcutorAutowireDTO {
	
	private String a="raam";
	private String b="shyaam";
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}

}
