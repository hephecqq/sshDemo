package com.kostech.spring.test;

public class UserManagerImpl1 implements UserManagerI {

	@Override
	public void addUser(User user) {
		System.out.println("UserManagerImpl1 add User  "+user);
	}

}
