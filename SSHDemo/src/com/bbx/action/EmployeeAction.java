package com.bbx.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.bbx.entities.Employee;
import com.bbx.service.EmployService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 1.spring����web.xml�ļ�������strurs2��filter
 * 2.����struts2�������ļ�
 * 3.����
 * 4.����strut2��spring�����jar��
 * 5.��spring�������ļ�������Action��ע��ActionScopeΪprototype���ǵ�����
 * 6.��struts2�������ļ�������Actionʱclass����ָ���Action��IOC�����е�ID
 * 
 */
public class EmployeeAction extends ActionSupport implements RequestAware{

	/**
	 * 
	 */
	private Map<String,Object> request;
	EmployService empService;
	public EmployService getEmpService() {
		return empService;
	}

	public void setEmpService(EmployService empService) {
		this.empService = empService;
	}

	private static final long serialVersionUID = 1L;

	public String list(){
		List<Employee> emps=empService.list();
		ActionContext.getContext().getSession().put("emps", emps);
		request.put("emps", emps);
		return "list";
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request=arg0;
	}
	
}

