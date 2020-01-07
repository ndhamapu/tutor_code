<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="sample.cityData"%>
<html>
<head><title>Table Example</title></head>
<body>
	<table border=1 cellpadding="0" cellspacing="0">
	<tr>
		<td>City</td>
		<td>Direction</td>
		<td>SubCity</td>
	</tr>
	<%
	cityData cD = new cityData();
	ResultSet rs = cD.getData("Pune", "North");
	while(rs.next()) {
	%>
	<tr>
		<td align="center"><%=rs.getString("City")%></td>
		<td align="center"><%=rs.getString("Direction")%></td>
		<td align="center"><%=rs.getString("SubCity")%></td>
	</tr>
	<%}%>
</table>
</body>
</html>

