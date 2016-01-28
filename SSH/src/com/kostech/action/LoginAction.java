package com.kostech.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		ActionContext context=ActionContext.getContext();
		Map<String,Object> session=context.getSession();
		session.put("username", "уехЩ");
		String result = "";
		return result;
	}
}
