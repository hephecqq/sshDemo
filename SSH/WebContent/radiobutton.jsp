<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Struts 2 radio button example</h1>
	<s:debug></s:debug>
	<s:form action="resultAction" namespace="/">
		<h1>
			<s:radio label="Gender" name="yourGender" list="genders"
				value="defaultGenderValue"></s:radio>
			<s:radio label="Gender" list="languages" name="yourLanguage"
				listKey="languageCode" listValue="languageDisplay"
				value="defaultLanguageValue"></s:radio>
			<s:radio list="#{'1':'Yes','2':'No'}" value="2" label="Answer"
				name="yourAnswer"></s:radio>
			<s:submit value="submit" name="submit"></s:submit>
		</h1>
	</s:form>
</body>
</html>