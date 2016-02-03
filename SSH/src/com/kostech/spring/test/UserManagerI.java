package com.kostech.spring.test;

import java.sql.SQLException;

import org.hibernate.HibernateException;

public interface UserManagerI {
	public void addUser(User user) throws HibernateException, SQLException;
}
