package com.kostech.spring.aop.test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AuthAspect {

	//匹配该包下的所有类
	@Before("execution(* com.kostech.service.*.*(. .))")
	//所有方法的执行作为切入点
	public void authority(){
		System.out.println("模拟执行权限检查...");
	}
}
