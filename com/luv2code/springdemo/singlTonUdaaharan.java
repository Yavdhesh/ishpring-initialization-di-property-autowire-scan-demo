package com.luv2code.springdemo;

import java.util.Random;

public class singlTonUdaaharan implements RandomSamkhya{

	@Override
	public void randomMethod() {
		System.out.println("yahaa par har baar ek nayi samkhyaa hogi = "+(new Random()).nextLong());
		
	}

	//destroy-method
	@Override
	public void samaaptMethod() {
		System.out.println("Haai Raam, mai singleton mar gayaa re ");
		
	}

}
