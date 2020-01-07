<html>
<head><title>Table Example</title></head>
<body>
	<table border=1 cellpadding="0" cellspacing="0">
	<tr>
		<td>Name</td>
		<td>Address</td>
		<td>Roll No</td>
	</tr>
	<%
	for(int i=0; i< 12; i++) {
	%>
	<tr>
		<td align="center"><%=i+1%></td>
		<td align="center"><%=i+2%></td>
		<td align="center"><%=i+3%></td>
	</tr>
	<%}%>
</table>
</body>
</html>

