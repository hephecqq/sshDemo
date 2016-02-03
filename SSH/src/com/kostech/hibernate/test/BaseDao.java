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

	//插入一条数据
	Integer insert(T t) throws HibernateException, SQLException;
	//更新一条数据
	Integer update(Integer id) throws HibernateException, SQLException;
	//删除一条数据
	Integer delete(Integer id) throws HibernateException, SQLException;
	//查询一条数据
	T getT(T t);
	List<T> getAllT(News news) throws HibernateException, SQLException;
	
}
