package com.kostech.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//ʹ��ע��ķ�ʽָ����ǰbean��������Χ
//ʹ��Repositoryע��ķ�ʽ��ָ����ǰBean�����֣�����������ʵ����
@Scope("prototype")
@Repository("type")
public class Type {

	private Integer id;
	private String name;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", name=" + name + "]";
	}
	public Type() {
		super();
	}
	public Type(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
