package com.kostech.easymock.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
		System.out.println("testPrintMessage");
	}
	
	@Test
	public void testPrintInfo(){
		assertEquals(message, messageUtil.printMessage());
		System.out.println("testPrintInfo");
	}
}
