package com.bbx.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bbx.entities.Employee;

public class EmployeeDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Employee> getAll() {
		// ������������,��ȡ����Ա������Ϣ
		String hql = "FROM Employee e LEFT OUTER JOIN FETCH e.department";

		return getSession().createQuery(hql).list();

	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

}
