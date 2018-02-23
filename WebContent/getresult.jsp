<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>使用Java JSP GET</title>
</head>
<body>
<h1 align="center">推荐使用JSP分离VIEW--实现 MVC结构</h1>
<p>
<%
	String name = (String)request.getAttribute("param1");
	String secrity = (String)request.getAttribute("param2");
	String today = (String)request.getAttribute("today");
%>
<p>	姓名: <%= name %> </p>	
<p>	密码: <%= secrity %></p>	
<b> <%= today %></b><br /><br />				
<b> ${ applicationScope.dog.getBreed() }</b><br /><br />	
<b> ${ initParam.foo }</b><br />	
<b> ${ initParam.adminEmail }</b><br />	
</body>
</html>