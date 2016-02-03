package com.kostech.spring.test;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.imooc.util.HibernateSessionFactory;

@Repository(value="user2Dao")
public class User2Dao {

	@Autowired
	HibernateSessionFactory factory;
	public void addUser(User user) throws HibernateException, SQLException{
		System.out.println("User2Dao addUser...");
		Session session=factory.getCurrentSession();
		
	}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	@SuppressWarnings("unused")
	User2Dao userDao=(User2Dao) context.getBean("user2Dao");
	
}
}

