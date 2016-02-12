package com.bbx.service;

import java.util.List;

import com.bbx.dao.EmployeeDao;
import com.bbx.entities.Employee;

public class EmployService {

	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> list(){
		return employeeDao.getAll();
	}
}
