package com.kostech.spring.test;

import java.sql.SQLException;

import org.hibernate.HibernateException;

public class UserManagerImpl2 implements UserManagerI {

	User2Dao ud2;
	
	public UserManagerImpl2() {
		super();
	}

	public UserManagerImpl2(User2Dao ud2) {
		super();
		this.ud2 = ud2;
	}

	

	@Override
	public void addUser(User user) throws HibernateException, SQLException {
		System.out.println("UserManagerImpl2 add User  "+user);
		ud2.addUser(user);
	}

}
