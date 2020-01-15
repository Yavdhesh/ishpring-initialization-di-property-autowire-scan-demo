package com.luv2code.springdemo;

public class PropertyWaaliClassImpl implements PropertyWaaliClass {

	private String ram;
	private String shyaam;
	
	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getShyaam() {
		return shyaam;
	}

	public void setShyaam(String shyaam) {
		this.shyaam = shyaam;
	}

	@Override
	public void showProperties() {
		System.out.println("raam =="+this.ram+" , shyaam == "+this.shyaam);

	}

}
