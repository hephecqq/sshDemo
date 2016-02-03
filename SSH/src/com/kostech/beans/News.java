package com.kostech.beans;

import java.util.Date;

public class News {

	private Integer id;
	private String name;
	private Type type;
	private Date date;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", name=" + name + ", type=" + type + ", date=" + date + "]";
	}
	public News(Integer id, String name, Type type, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.date = date;
	}
	public News() {
		super();
	}
	
}
