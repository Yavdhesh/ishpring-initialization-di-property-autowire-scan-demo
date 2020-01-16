package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	
	public void mainHu(){
		
		System.out.println("mai hu tracjcoach, ek adbhut vyakti jo 1000 km dod saktaa hai");
	}
	
	public void mainNhiHu(){
		
		System.out.println("mai hu tracjcoach, ab mai nhi hu kyuki mai nasht ho rhaa hu");
	}
	
	
	public TrackCoach(FortuneService fortuneService){
		this.fortuneService= fortuneService;
		
	}
	

}










