package com.kostech.hibernate.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kostech.utils.HibernateSessionFactory;

public class Test {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.currentSession();
		Transaction tx=session.beginTransaction();
		//²âÊÔHQL»ù´¡
		String hql="";
		Query query=session.createQuery(hql);
		query.list();
		
		
		tx.commit();
	}
}
