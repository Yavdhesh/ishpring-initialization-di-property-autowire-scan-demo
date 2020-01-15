package com.luv2code.springdemo.configurationAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:sport.properties")
public class ConfigutaionAnnotationCLass {

	
	
	@Bean
	public Pehli pehli (){
		return new Pehli();
	}
	
	@Bean
	public Duji duji(){
		return new Duji(pehli());
	}
}
