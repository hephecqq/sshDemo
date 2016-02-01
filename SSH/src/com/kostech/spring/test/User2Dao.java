package com.kostech.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository(value="user2Dao")
public class User2Dao {

	
	public void addUser(User user){
		System.out.println("User2Dao addUser...");
		
	}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	@SuppressWarnings("unused")
	User2Dao userDao=(User2Dao) context.getBean("user2Dao");
	
}
}

