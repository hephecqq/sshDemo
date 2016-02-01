package com.kostech.beans;

import java.lang.annotation.Annotation;

public class RequiredAnnotaionExtraction {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> clazz=Class.forName("com.kostech.beans.Address");
		Annotation annotation=clazz.getAnnotation(Kostech.class);
		if(annotation.getClass()==Kostech.class){
			Kostech kostech=(Kostech)annotation;
			String value=kostech.value();
			if(value!=null&&value.equals("required")){
				//execute other program...
			}
			if(value.equals("not required")){
				//break;
			}
		}
	}
}
