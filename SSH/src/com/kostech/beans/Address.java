package com.kostech.beans;

public class Address {

	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAddress_name() {
		return address_name;
	}
	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}
	private Integer aid;
	private String address_name;
	private Customer cutomer;
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", address_name=" + address_name + ", cutomer=" + cutomer + "]";
	}
	public Customer getCutomer() {
		return cutomer;
	}
	public void setCutomer(Customer cutomer) {
		this.cutomer = cutomer;
	}
}
