package com.kostech.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kostech.constant.ReConst;

public class HibernateSessionFactory {

	//private static String CONFIG_FILE_LOCATION="/hibernate.cfg.xml";
	private static final ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	private static final Configuration cfg=new Configuration();
	private static SessionFactory sessionFactory=null;
	
	//取得session
	@SuppressWarnings("deprecation")
	public static Session currentSession() throws HibernateException{
		Session session=(Session)threadLocal.get();
		if(session==null){
			if(sessionFactory==null){
				try{
					cfg.configure(ReConst.CONFIG_FILE_LOCATION);
					sessionFactory=cfg.buildSessionFactory();
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
	
	//关闭session对象
	public static void closeSession() throws HibernateException{
		Session session=(Session) threadLocal.get();
		threadLocal.set(null);
		if(session!=null){
			session.close();
		}
	}
	
}
