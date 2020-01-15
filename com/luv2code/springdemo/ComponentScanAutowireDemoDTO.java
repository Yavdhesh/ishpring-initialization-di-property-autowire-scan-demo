package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ComponentScanAutowireDemoDTO {

	
	private String ram;
	private String Shyaam;
	
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getShyaam() {
		return Shyaam;
	}
	public void setShyaam(String shyaam) {
		Shyaam = shyaam;
	}
}
