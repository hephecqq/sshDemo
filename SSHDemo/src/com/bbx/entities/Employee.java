package com.bbx.entities;

import java.util.Date;

public class Employee {

	private Integer id;
	// ���ܱ��޸�
	private String lastName;
	private String email;
	// ��ǰ�˴������String���ͣ���Ҫת��
	private Date birth;
	private Date createTime;
	//������һ�Ĺ�����ϵ
	private Department department;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}