package com.kostech.spring.junit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//���ز���������
//@RunWith(SpringJUnit4ClassRunner.class)
//����Spring�������ļ�
@ContextConfiguration("classpath:applicationContext.xml")
public class TetsSpringJunit {

	@Test
	public void transfer(){
		
	}
}
