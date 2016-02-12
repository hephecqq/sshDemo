<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 导入struts2标签 -->
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:if test="#request.emps==null||
#request.employees.size==0">
	没有任何用户信息！
</s:if>
<s:else>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>EMAIL</td>
			<td>BIRTH</td>
			<td>CREATETIME</td>
			<td>DEPT</td>
			<s:iterator value="#request.emps" var="emp">
				<td>${emp.id}</td>
				<td>${emp.name }</td>
				<td>${emp.email }</td>
				<td>${emp.birth }</td>
				<td>${emp.createTime }</td>
				<td>${deptment.departmentName}</td>
			</s:iterator>
		</tr>
		
	</table>
</s:else>
</body>
</html>