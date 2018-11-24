<%@ page import="java.util.*,
tybca.Map" %>
<tr>
<td width="120"> &nbsp; </td>
<td align="right">
<b> Success! </b>
</td>
</tr>
<tr>
<td width="120"> &nbsp; </td>
<td align="right">
<jsp:getProperty name="mymap" property="name" />
<br>
<jsp:getProperty name="mymap" property="email" />
</td>
</tr>