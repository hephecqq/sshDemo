//package com.kostech.hibernate.test;
//
//import java.sql.SQLException;
//import java.util.List;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.imooc.util.HibernateSessionFactory;
//import com.kostech.beans.News;
//
//@Repository
//public class TypeDAO<Type> implements BaseDao<Type> {
//
//	@Autowired
//	HibernateSessionFactory hibernateSessionFactory;
//
//	@Override
//	public Integer insert(Type t) throws HibernateException, SQLException {
//		@SuppressWarnings("static-access")
//		Session session = hibernateSessionFactory.getCurrentSession();
//		Transaction tx = null;
//		int ret = 0;
//		try {
//			tx = session.beginTransaction();
//			session.save(t);
//		} catch (RuntimeException e) {
//			tx.rollback();
//			ret = -1;
//			return ret;
//		}
//
//		tx.commit();
//		return ret;
//	}
//
//	@Override
//	public Integer update(Integer id) throws HibernateException, SQLException {
//		Session session = HibernateSessionFactory.getCurrentSession();
//		Transaction tx = null;
//		int ret = 0;
//		try {
//			tx = session.beginTransaction();
//			com.kostech.beans.Type type=(com.kostech.beans.Type) session.get(com.kostech.beans.Type.class,id);
//			session.saveOrUpdate(type);
//		} catch (RuntimeException e) {
//			tx.rollback();
//			ret = -1;
//			return ret;
//		}
//
//		tx.commit();
//		return ret;
//	}
//
//	@Override
//	public Integer delete(Integer id) throws HibernateException, SQLException {
//		Session session = HibernateSessionFactory.getCurrentSession();
//		Transaction tx = null;
//		int ret = 0;
//		try {
//			tx = session.beginTransaction();
//			com.kostech.beans.Type type=session.get(com.kostech.beans.Type.class, id);
//			session.delete(type);
//		} catch (RuntimeException e) {
//			tx.rollback();
//			ret = -1;
//			return ret;
//		}
//
//		tx.commit();
//		return ret;
//	}
//
//	@Override
//	public Object getT(Object t) throws HibernateException, SQLException {
//		Session session = HibernateSessionFactory.getCurrentSession();
//		Transaction tx = null;
//		int ret = 0;
//		try {
//			tx = session.beginTransaction();
//			String hql="from Type where id = ?";
//			com.kostech.beans.Type type=session.get(com.kostech.beans.Type.class);
//			Query query=session.createQuery(hql).setString(0, type.);
//			query.list();
//			
//			session.save(t);
//		} catch (RuntimeException e) {
//			tx.rollback();
//			ret = -1;
//			return ret;
//		}
//
//		tx.commit();
//		return ret;
//	}
//
//	@Override
//	public List getAllT(News news) {
//		Session session = hibernateSessionFactory.getCurrentSession();
//		Transaction tx = null;
//		int ret = 0;
//		try {
//			tx = session.beginTransaction();
//			session.save(t);
//		} catch (RuntimeException e) {
//			tx.rollback();
//			ret = -1;
//			return ret;
//		}
//
//		tx.commit();
//		return ret;
//	}
//
//}
