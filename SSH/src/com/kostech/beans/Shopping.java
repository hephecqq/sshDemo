package com.kostech.beans;

public class Shopping {

	private String sid;
	private String sname;
	private User user;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Shopping [sid=" + sid + ", sname=" + sname + ", user=" + user + "]";
	}
	
}
