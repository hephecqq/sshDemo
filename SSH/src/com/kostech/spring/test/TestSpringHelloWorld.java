package com.kostech.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringHelloWorld {

	@Test
	public void test(){
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld.show());
		
		/**
		 *  HelloWorld Constructor...
			setName: hepeng
			HelloWorld  com.kostech.spring.test.HelloWorld--->hepeng
			hepeng

		 * */
		
		HelloWorld helloWorld2=(HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld==helloWorld2);
		//Ĭ�J��r���ǆ�����true
		
		
		//��IOC�����л�ȡUser Bean
		User user=context.getBean(User.class);
		//��IOC�����л�ȡUserManager Bean
		UserManager manager=context.getBean(UserManager.class);
		manager.addUser(user);
		
	}
}
