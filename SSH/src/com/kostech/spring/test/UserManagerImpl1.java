package com.kostech.spring.test;

public class UserManagerImpl1 implements UserManagerI {

	User2Dao ud2;
	public User2Dao getUd2() {
		return ud2;
	}
	public void setUd2(User2Dao ud2) {
		this.ud2 = ud2;
	}
	@Override
	public void addUser(User user) {
		System.out.println("UserManagerImpl1 add User  "+user);
		ud2.addUser(user);
	}

}
