package com.kostech.spring.test;

import java.net.URL;

import org.apache.struts2.ServletActionContext;

public class TestClasspath {

	public static void main(String[] args) {
		URL s1=TestClasspath.class.getResource("");
		System.out.println(s1.getFile().toString());
		URL s2=TestClasspath.class.getResource("/");
		System.out.println(s2.getFile().toString());
		//		String s3=TestClasspath.class.getClassLoader().getResource("");
//		String s4=TestClasspath.class.getClassLoader().getResource("/");
//		
		String s5=ServletActionContext.getServletContext().getRealPath("/resources");
		System.err.println(s5);
	}
}
