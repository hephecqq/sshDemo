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
		//��Ʊ
		System.out.println("��Ʊ...");
		buyingTicket();
		//����
		System.out.println("����...");
		travelByTrain();
		//��ף
		System.out.println("��ף...");
		celebrate();
	}
	
}
