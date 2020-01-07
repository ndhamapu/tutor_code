<%@ page import="java.util.Date" %>

<HTML>
	<H1> First JSP Page </H1>
		<BODY>
		     <% out.println("Hello"); 
			
			Date d = new Date();
			out.println("Date="+d.toString());

%>
		</BODY>
</HTML>