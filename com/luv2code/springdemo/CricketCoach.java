/**
 * 
 */
package com.luv2code.springdemo;

/**
 * @author hp
 *
 */
public class CricketCoach implements Coach {

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyWorkout()
	 */
	
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Haa jiji, mai hu cricket prashikshak ji";
	}
	
	//setter hai ye hai, kaam aavegaa
	//setter ke shabd ke sahi likhnaa anivaaryaa hai, nhi to gadbad ho sakti hai
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

}
