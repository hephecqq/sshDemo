package com.kostech.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.kostech.constant.ReConst;

public class HibernateSessionFactory {

	//private static String CONFIG_FILE_LOCATION="/hibernate.cfg.xml";
	private static final ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	private static final Configuration cfg=new Configuration().configure();
	private static SessionFactory sessionFactory=null;
	private static ServiceRegistry serviceRegistry=null;
	//ȡ��session
	@SuppressWarnings("deprecation")
	public static Session currentSession() throws HibernateException{
		Session session=(Session)threadLocal.get();
		if(session==null){
			if(sessionFactory==null){
				try{
					serviceRegistry = 
							new ServiceRegistryBuilder().applySettings(cfg.getProperties())
							                            .buildServiceRegistry();
					sessionFactory = cfg.buildSessionFactory(serviceRegistry);
				}catch(Exception e){
					System.out.println("Error Creating SessionFactory");
					e.printStackTrace();
				}
			}
		session=sessionFactory.openSession();
		threadLocal.set(session);
		}
		
		return session;
	}
	
	//�ر�session����
	public static void closeSession() throws HibernateException{
		Session session=(Session) threadLocal.get();
		threadLocal.set(null);
		if(session!=null){
			session.close();
		}
	}
	
}
