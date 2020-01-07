 <html> 
   <head> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Welcome Page</title> 
      </head> 
       <% String num = request.getParameter("t1"); %> 
    <body> 
         sum is <% String f=num.charAt(0)+"";
int l=num.length();
int ff=Integer.parseInt(f);
String ll=num.charAt(l-1)+"";
int d=Integer.parseInt(ll);
int s=ff+d;%>
 <font size="18" color="red">Sum=<%=s %></font> 
</body> 
</html> 
