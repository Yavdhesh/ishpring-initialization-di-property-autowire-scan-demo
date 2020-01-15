package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("pehli")
public class ComponentScanUdaaharanOne implements ComponetScanDemoInterface {

	//field injection
	@Autowired
	private ComponentScanAutowireDemoDTO componentScanAutowireDemoDTO;
	
	//contrcutor injection
	private ConstrcutorAutowireDTO constrcutorAutowireDTO;

	//interface constructor injection
	private AutowireInterfaceInjection autowireInterfaceInjection;
	
	@Override
	public void dekho() {
		System.out.println("haaji dekho ek waalaa");
	}

	@Override
	public void bataao() {
		System.out.println("haaji bataao ek waalaa");
		System.out.println("haaji bataao ek waalaa"+componentScanAutowireDemoDTO);
        
	}
	
	public ComponentScanUdaaharanOne(){
		System.out.println("waali pehli");
		System.out.println("ye hai autowired class"+componentScanAutowireDemoDTO);
	}
	
	@Autowired
	public ComponentScanUdaaharanOne(ConstrcutorAutowireDTO constrcutorAutowireDTO,AutowireInterfaceInjection autowireInterfaceInjection){
		this.constrcutorAutowireDTO = constrcutorAutowireDTO;
		System.out.println("Constrcuort Dependency Injection huaa hai bhaaiyo, a= "+constrcutorAutowireDTO.getA());
		
		this.autowireInterfaceInjection=autowireInterfaceInjection;
		System.out.println("interface injection");
		autowireInterfaceInjection.met();
	}

}
