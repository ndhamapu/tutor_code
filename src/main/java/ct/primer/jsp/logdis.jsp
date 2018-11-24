<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="mylogin.loginValidate" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Slip7</title>
</head>


<body>
<h1>Display</h1>
<%
	String name=request.getParameter("t1"); 
	String pass=request.getParameter("t2"); 
	loginValidate l= new loginValidate();
	ResultSet rs=l.insertData(name, pass);
	if(rs==null)
	{%>
		<jsp:forward page="login.jsp"></jsp:forward>

		
<%	}
	
	else
	{
%>
	User name:-<%= name %><br>
	Password:-<%= pass %><br>
</body>
</html>	
<%	}
%>


