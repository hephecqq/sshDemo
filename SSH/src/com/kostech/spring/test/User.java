package com.kostech.spring.test;

public class User {

	private Integer id;
	private String name;
	private String desc;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public User() {
		super();
	}
	public User(Integer id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
}
