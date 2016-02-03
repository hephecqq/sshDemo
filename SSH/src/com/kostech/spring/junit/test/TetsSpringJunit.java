package com.kostech.spring.junit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//加载测试驱动类
//@RunWith(SpringJUnit4ClassRunner.class)
//加载Spring的配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class TetsSpringJunit {

	@Test
	public void transfer(){
		
	}
}
