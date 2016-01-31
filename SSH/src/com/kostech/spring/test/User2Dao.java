package com.kostech.spring.test;

public class User2Dao {

	UserManagerI um1;
	public void addUser(User user){
		System.out.println("User2Dao addUser...");
		um1.addUser(user);
	}
}
