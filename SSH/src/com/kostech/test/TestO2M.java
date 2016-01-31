package com.kostech.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kostech.beans.Grade;
import com.kostech.beans.Student;
import com.kostech.utils.HibernateSessionFactory;

public class TestO2M {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.currentSession();
		Transaction tx=session.beginTransaction();
		Student s1=new Student(1001,"zs","ÄÐ");
		Student s2=new Student(1002,"ls","Å®");
		
		Grade grade=new Grade();
		grade.setGid(90090);
		grade.setDesc("xxxx");
		grade.setGname("haha");
		grade.getStus().add(s1);
		grade.getStus().add(s2);
		session.persist(grade);
		session.save(s1);
		session.save(s2);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}
}
