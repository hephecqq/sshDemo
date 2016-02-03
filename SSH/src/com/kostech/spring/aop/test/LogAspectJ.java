package com.kostech.spring.aop.test;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspectJ {
	public LogAspectJ() {
		System.out.println("LogAspectJ...");
	}
	
}
