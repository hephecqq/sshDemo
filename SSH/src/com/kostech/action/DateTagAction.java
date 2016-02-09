package com.kostech.action;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class DateTagAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Date customDate;
	
	@Override
	public String execute() throws Exception {
		Calendar cal=Calendar.getInstance();
		cal.set(2010, 0,31);
		Date newDate=cal.getTime();
		System.out.println(newDate.toString());
		setCustomDate(newDate);
		return SUCCESS;
		
	}

	public Date getCustomDate() {
		return customDate;
	}

	public void setCustomDate(Date customDate) {
		this.customDate = customDate;
	}

	
}
