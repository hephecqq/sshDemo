package com.kostech.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterfaceImpl {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserManagerI um=context.getBean(UserManagerImpl2.class);
		System.out.println(um.getClass().getName());
		
	}
}
