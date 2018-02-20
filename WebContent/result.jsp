<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>使用Java JSP</title>
</head>
<body>
<h1 align="center">推荐使用JSP</h1>
<p>
<%
	String color = (String)request.getAttribute("color");
	List style = (List)request.getAttribute("styles");
	Iterator it = style.iterator();
	while(it.hasNext()){
		
		out.println("<hr />兴趣爱好: " + it.next() + "喜欢 <b>" + color+"</b>" );
	}
%>
</body>
</html>