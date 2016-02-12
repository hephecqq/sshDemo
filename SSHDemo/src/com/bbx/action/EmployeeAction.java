package com.bbx.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.bbx.entities.Employee;
import com.bbx.service.EmployService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 1.spring整合web.xml文件中配置strurs2的filter
 * 2.加入struts2的配置文件
 * 3.整合
 * 4.加入strut2的spring插件的jar包
 * 5.在spring的配置文件中配置Action，注意ActionScope为prototype不是单例的
 * 6.在struts2的配置文件中配置Action时class属性指向该Action在IOC容器中的ID
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

