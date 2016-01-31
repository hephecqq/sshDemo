package com.kostech.spring.test;

public class HelloWorld {

	private String name;
	
	public String show(){
		System.out.println("HelloWorld  "+this.getClass().getName()+"--->"+name);
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName: "+name);
		this.name = name;
	}

	public HelloWorld(String name) {
		System.out.println("HelloWorld Constructor..."+name);
		this.name = name;
	}

	public HelloWorld() {
		System.out.println("HelloWorld Constructor...");
	}
	
}
