package com.kostech.spring.aop.test;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.imooc.util.HibernateSessionFactory;
import com.kostech.spring.test.User;

public class TransferDAOImpl implements TransferDAO{

	String hql="update Account set money = money -? where name = ?";
	//����������ݿ�Ĵ����
	
	public void transfer(User a, User b, Double money) throws HibernateException,SQLException {
		Session session=HibernateSessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(a);
		session.saveOrUpdate(b);
		tx.commit();
		
	}
	@Override
	public void transfer(String in, String out, Double money) {
		
	}

}
