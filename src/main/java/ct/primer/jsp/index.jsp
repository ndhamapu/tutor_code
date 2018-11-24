<html> 
<head>
<title>JSP forward example with parameters</title>
</head>
<body> 
<jsp:forward page="display.jsp"> 
<jsp:param name="name" value="Tapan" /> 
<jsp:param name="site" value="yahoo.com" /> 
<jsp:param name="tutorialname" value="jsp forward action" /> 
<jsp:param name="reqcamefrom" value="index.jsp" /> 
</jsp:forward> 
</body> 
</html>
