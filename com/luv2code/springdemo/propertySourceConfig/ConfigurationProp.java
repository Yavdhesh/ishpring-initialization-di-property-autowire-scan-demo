package com.luv2code.springdemo.propertySourceConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value={"classpath:sport.properties","classpath:application.properties"})
public class ConfigurationProp {
	
	
	@Bean
	public IndependentClass indepedentClass(){
		return new IndependentClass();
	}
	
	@Bean
	public DependentClass dependentClass(){
		return new DependentClass(indepedentClass());
	}

}
