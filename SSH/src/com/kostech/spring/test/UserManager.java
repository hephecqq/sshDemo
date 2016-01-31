package com.kostech.spring.test;

public class UserManager {

	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user){
		userDao.addUser(user);
	}
}
