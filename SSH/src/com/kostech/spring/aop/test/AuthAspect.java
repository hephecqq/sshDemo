package com.kostech.spring.aop.test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AuthAspect {

	//ƥ��ð��µ�������
	@Before("execution(* com.kostech.service.*.*(. .))")
	//���з�����ִ����Ϊ�����
	public void authority(){
		System.out.println("ģ��ִ��Ȩ�޼��...");
	}
}
