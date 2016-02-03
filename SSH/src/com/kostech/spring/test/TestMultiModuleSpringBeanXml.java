package com.kostech.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiModuleSpringBeanXml {

	@Test
	public void test() {
		// spring配置文件中的整合
		/**
		 * <beans> <import resources=""/> </beans>
		 */

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-all-module.xml");

	}
}
