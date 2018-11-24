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
        <title>JSP Page</title>
    </head>
    <body>
        <form name="TYBCA Form" action="response.jsp" method="POST">
		<br><br>
            <b>Select City:</b>
            <select name="city">
                <option>pune</option>
                <option>Mumbai</option>
                <option>Nagpur</option>
            </select>&nbsp;&nbsp;
            <b>East<input type="radio" name="Direction" value="East" />
            West<input type="radio" name="Direction" value="West" />
            North<input type="radio" name="Direction" value="North" />
            South</b><input type="radio" name="Direction" value="South" />
            <br><br><input type="submit" value="submit" name="submit" />
        </form>
        
    </body>
</html>
