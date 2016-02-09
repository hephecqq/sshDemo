<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="${pageContext.request.contextPath}/resources/script/jquery-1.4.2.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/script/jquery-ui-1.11.4/jquery-ui.min.css">
<script
	src="${pageContext.request.contextPath}/resources/script/jquery-ui-1.11.4/jquery-ui.min.js"></script>

</head>
<body>
	<h1>Struts 2 date tag example</h1>

	<ol>

		<li>Default date format --> <strong><s:date
					name="customDate" /></strong>
		</li>

		<li>Date format in "dd/MM/yyyy" --> <strong><s:date
					name="customDate" format="dd/MM/yyyy" /></strong>
		</li>

		<li>In Date tag, set the nice attribute to "true" --> <strong><s:date
					name="customDate" nice="true" /></strong>
		</li>

	</ol>
	<script>
		$(function() {
			$("#datepicker").datepicker();
		});
	</script>
	<p>日期：<input type="text" id="datepicker"></p>
	<p>Test:<input type="text" id="test"/>
</body>
</html>