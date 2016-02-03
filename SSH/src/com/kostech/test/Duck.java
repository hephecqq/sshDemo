package com.kostech.test;

public abstract class Duck {
	public FlyI fly;
	public GagI gag;
	public Duck(){}
	public Duck(GagI gag,FlyI fly){
		this.gag=gag;
		this.fly=fly;
	}
	public void display(){
		System.out.println("duck...");
	}
}
