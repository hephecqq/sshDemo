package com.kostech.pattern.test;

public class HappyPeople {

	public void buyingTicket(){
		System.out.println("buyingTicket...");
	}
	public void travelByTrain(){
		System.out.println("travelByTrain...");
	}
	public void celebrate(){
		System.out.println("celebrate...");
	}
	public void celebrateSpringFestival(){
		//ÂòÆ±
		System.out.println("ÂòÆ±...");
		buyingTicket();
		//×ø³µ
		System.out.println("×ø»ð³µ...");
		travelByTrain();
		//Çì×£
		System.out.println("Çì×£...");
		celebrate();
	}
	
}
