package com.kostech.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringHelloWorld {

	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld.show());
		
		/**
		 *  HelloWorld Constructor...
			setName: hepeng
			HelloWorld  com.kostech.spring.test.HelloWorld--->hepeng
			hepeng

		 * */
	}
}
