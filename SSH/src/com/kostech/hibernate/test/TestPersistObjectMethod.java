package com.kostech.hibernate.test;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.imooc.util.HibernateSessionFactory;
import com.kostech.beans.News;

public class TestPersistObjectMethod {

	public static void main(String[] args) throws HibernateException, SQLException {
		Session session=HibernateSessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			News news1=new News();
			session.save(news1);
		} catch (RuntimeException e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		
		tx.commit();
		
	}
}
