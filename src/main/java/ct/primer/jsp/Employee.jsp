<%-- 
    Document   : index
    Created on : Dec 4, 2014, 10:34:06 AM
    Author     : tmondal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Page for MCASY</title>
    </head>
    <body>
        <form name="EmployeeForm" action="/examples/EmployeeServlet" method="POST">
		<br><br>
		<b>Employee Number:</b><input type="text" name="EmpNo" value="" /><br><br>
		<b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Employee Name:</b><input type="text" name="EmpName" value="" /><br><br>
		<b>Employee Address:</b><input type="text" name="EmpAddr" value="" /><br>
            <br><br><input type="submit" value="submit" name="submit" />
        </form>
        
    </body>
</html>
