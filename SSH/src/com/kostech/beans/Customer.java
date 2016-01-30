package com.kostech.beans;

import java.util.List;

public class Customer {

	private Integer id;
	private String cname;
	private List<Address> address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cname=" + cname + ", address=" + address + "]";
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
}
