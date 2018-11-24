<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="com.tapan.CityData"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Response Page</title>
    </head>
    <body>
        <%
String city=request.getParameter("city");
String dir=request.getParameter("Direction");
CityData locCity = new CityData();
ResultSet rs =locCity.getData(city,dir);
//out.println("ResultSet Received");
%>
City:<%=city%>&nbsp;&nbsp;Direction:<%=dir%>
<br><br>
<table border=1>
<tr>
<td>SubCity</td>
<td>Population</td>
</tr>
<% while(rs.next()){%>
<tr>
<td><%=rs.getString("subcity")%></td>
<td><%=rs.getInt("population")%></td>
</tr>
<% } %>
</tr>
</table>
    </body>
</html>
