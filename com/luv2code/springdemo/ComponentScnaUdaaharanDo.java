package com.luv2code.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component(value="dusri")
@Component
public class ComponentScnaUdaaharanDo implements ComponetScanDemoInterface {

	@Override
	public void dekho() {
		System.out.println("haaji dekho DO waalaa");

	}

	@Override
	public void bataao() {
		System.out.println("haaji bataao do waalaa");

	}
	
	public ComponentScnaUdaaharanDo(){
System.out.println("dsuri");
	}

}
