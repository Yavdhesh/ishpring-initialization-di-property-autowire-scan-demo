package com.luv2code.springdemo;

import javax.management.JMException;
import javax.management.modelmbean.ModelMBeanInfo;

import org.springframework.jmx.export.assembler.AutodetectCapableMBeanInfoAssembler;
import org.springframework.stereotype.Component;

@Component
public class AutowireInterfaceInjectionImpl implements AutowireInterfaceInjection {


	@Override
	public void met() {
		System.out.println("interface ko kriyaanvit karni waali class");

	}

}
