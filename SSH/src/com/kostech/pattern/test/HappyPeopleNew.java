package com.kostech.pattern.test;

public abstract class HappyPeopleNew {

	protected void buyingTicket(){
		System.out.println("buyingTicket...");
	}
	protected abstract void travelByWay();
	protected void celebrate(){
		System.out.println("celebrate...");
	}
	public void celebrateSpringFestival(){
		//ÂòÆ±
		System.out.println("ÂòÆ±...");
		buyingTicket();
		//×ø³µ
		System.out.println("ÔõÃ´×ø...");
		travelByWay();
		//Çì×£
		System.out.println("Çì×£...");
		celebrate();
	}
}
