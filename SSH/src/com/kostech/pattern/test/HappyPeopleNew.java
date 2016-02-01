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
		//��Ʊ
		System.out.println("��Ʊ...");
		buyingTicket();
		//����
		System.out.println("��ô��...");
		travelByWay();
		//��ף
		System.out.println("��ף...");
		celebrate();
	}
}
