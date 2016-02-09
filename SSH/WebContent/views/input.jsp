<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add a product</h1>
<form action="Product_save.action" method="post">
	Product Name:<input type="text" name="name"/><br/>
	Description:<input type="text" name="description"/><br/>
	Price:<input type="text" name="price"><br/>
	<input type="submit" value="保存"/>
</form>
</body>
</html>