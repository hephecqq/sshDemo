package com.kostech.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;


public class TestSessionFactory {

	
	
	@Test
	public void test(){
		@SuppressWarnings("unused")
		final ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
		final Configuration cfg=new Configuration().configure();
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		ServiceRegistry serviceRegistry=null;
		serviceRegistry = 
				new ServiceRegistryBuilder().applySettings(cfg.getProperties())
				                            .buildServiceRegistry();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		System.out.println(sessionFactory);
		session=sessionFactory.openSession();
		tx=session.beginTransaction();
		
		tx.commit();
	
	}
}
