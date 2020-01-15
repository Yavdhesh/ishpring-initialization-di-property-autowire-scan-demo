package com.luv2code.springdemo;

import java.util.Random;

public class protoTypeUdaaharan implements RandomSamkhya {

	@Override
	public void randomMethod() {
		
		System.out.println("yahaa par har baar ek nayi samkhyaa hogi = "+(new Random()).nextLong());
		
	}

	@Override
	public void samaaptMethod() {
		
		System.out.println("Haai Raam, mai mar gayaa re");
		
	}

}
