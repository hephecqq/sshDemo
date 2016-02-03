package com.kostech.test;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

public class TestResourceBundle {

	@Test
	public void test(){
		ResourceBundle resource=ResourceBundle.getBundle("config",Locale.US);
		System.out.println(resource.getString("username"));
		
	}
	
	
}
