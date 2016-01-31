package com.kostech.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Grade implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Grade() {
		super();
	}
	public Grade(Integer gid, String gname, String desc, Set<Student> stus) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.desc = desc;
		this.stus = stus;
	}
	private Integer gid;
	private String gname;
	private String desc ;
	private Set<Student> stus=new HashSet<Student>();
	@Override
	public String toString() {
		return "Grade [gid=" + gid + ", gname=" + gname + ", desc=" + desc + ", stus=" + stus + "]";
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Set<Student> getStus() {
		return stus;
	}
	public void setStus(Set<Student> stus) {
		this.stus = stus;
	}
}
