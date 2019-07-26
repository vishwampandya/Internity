<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="Error.jsp"
    isErrorPage="FALSE"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
	This is a jsp page
	<%!
		String name = "vishwam";
		
	%>
	<%session.setAttribute("name",name+""); %>
	<%@ include file="Header.jsp" %>
	
	<%
	
	float a=Integer.parseInt(request.getParameter("num1"));
	float b=Integer.parseInt(request.getParameter("num2"));
	float c=a/b;
	out.println(name+" your output is "+ c);
	//int f = 4/0;
	%>
</body>
</html>