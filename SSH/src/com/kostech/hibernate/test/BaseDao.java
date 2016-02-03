package com.kostech.hibernate.test;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;

import com.kostech.beans.News;

/***
 * 
 * @author zlj
 *
 * @param <T>
 */
public interface BaseDao<T> {

	//����һ������
	Integer insert(T t) throws HibernateException, SQLException;
	//����һ������
	Integer update(Integer id) throws HibernateException, SQLException;
	//ɾ��һ������
	Integer delete(Integer id) throws HibernateException, SQLException;
	//��ѯһ������
	T getT(T t);
	List<T> getAllT(News news) throws HibernateException, SQLException;
	
}
