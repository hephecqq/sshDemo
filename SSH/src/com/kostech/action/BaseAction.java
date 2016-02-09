package com.kostech.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware, ParameterAware {
	public Map<String, Object> requestMap;
	ActionContext context = ActionContext.getContext();
	ServletRequest servletRequest = ServletActionContext.getRequest();
	ServletResponse servletResponse = ServletActionContext.getResponse();
	ServletContext servletContext = ServletActionContext.getServletContext();

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {

		return Action.SUCCESS;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {

	}

	@Override
	public void setApplication(Map<String, Object> application) {

	}

	@Override
	public void setParameters(Map<String, String[]> parameters) {

	}

}
