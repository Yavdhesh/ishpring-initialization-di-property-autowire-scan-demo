package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("componentScan-applicationContext.xml");

ComponetScanDemoInterface cs= context.getBean("pehli", ComponetScanDemoInterface.class);

cs.bataao();
// agar @Comeponent me Id nhi daali to class kaa naam se spring id banaa degaa, udaharan nimna likhit hai 
ComponetScanDemoInterface cw= context.getBean("componentScnaUdaaharanDo", ComponetScanDemoInterface.class);
	}

}
