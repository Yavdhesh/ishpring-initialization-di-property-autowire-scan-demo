package com.luv2code.springdemo.configurationAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Duji {
	
	private Pehli pehli;
	
	public Duji(Pehli pehli){
		this.pehli=pehli;
	}
	
	
	
	@PostConstruct
	public void dujiostconst(){
		System.out.println("duji kaa postconstr");
	}
	
	
	public void aiseHi(){
		System.out.println("duji ro aise Hi");
	}
	
	@PreDestroy
	public void dujiDest(){
		System.out.println("duji kaa dest");
	}
	
	public void aiseHiPehliKaAiseHiCHalwaao(){
		System.out.println("duji kaa aise hiPehlei ke pehle");
		pehli.aiseHi();
	}

}
