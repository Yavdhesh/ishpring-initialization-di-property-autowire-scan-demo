package com.luv2code.springdemo.resourcebundle;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceBundleConfig {

	@Bean
	public MessageSource messageSource() {
	    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	    messageSource.setBasename("classpath:messages");
	    messageSource.setCacheSeconds(10); //reload messages every 10 seconds
	    return messageSource;
	}
	
}
