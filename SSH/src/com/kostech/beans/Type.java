package com.kostech.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//使用注解的方式指定当前bean的作用域范围
//使用Repository注解的方式来指定当前Bean的名字，并在容器中实例化
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
