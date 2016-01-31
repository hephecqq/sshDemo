package com.kostech.spring.test;

public class UserManagerImpl2 implements UserManagerI {

	@Override
	public void addUser(User user) {
		System.out.println("UserManagerImpl2 add User  "+user);
	}

}
