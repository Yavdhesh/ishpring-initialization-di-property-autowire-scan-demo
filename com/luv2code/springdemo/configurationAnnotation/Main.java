package com.luv2code.springdemo.configurationAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigutaionAnnotationCLass.class);
		
		Pehli p=context.getBean("pehli",Pehli.class );
		p.aiseHi();
		
		Duji d= context.getBean("duji", Duji.class);
		d.aiseHiPehliKaAiseHiCHalwaao();
		
		context.close();

	}

}
