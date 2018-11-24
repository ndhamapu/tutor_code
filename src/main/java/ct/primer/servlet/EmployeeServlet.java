package ct.primer.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeServlet extends HttpServlet {
// JDBC Code goes here
     static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
      static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
      //  Database credentials
      static final String USER = "system";
      static final String PASS = "system";
    private static final long serialVersionUID = 1L;

    @Override
    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
    // Get the parameters value
    String eno = request.getParameter("EmpNo");    
    String ename = request.getParameter("EmpName");    
    String eaddr = request.getParameter("EmpAddr");    
    
   
   Connection conn = null;
   Statement stmt = null;
   try{
       // STEP 1: Registering with JDBC driver for Oracle
       Class.forName(JDBC_DRIVER);
      //STEP 2: Creating the connection
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      //STEP 3: Creating a Statement and 
      System.out.println("Creating statement...");
      if(conn == null)
        System.out.println("Connection failed");
      stmt = conn.createStatement();
      String sql;
      sql = "insert into employee values(" + Integer.parseInt(eno) + ", '" + ename + "', '" + eaddr + "')" ;
      System.out.println("Statement executed " + sql);
      stmt.executeUpdate(sql);
     }
     catch (SQLException se) {
         se.printStackTrace();
     }
     catch (Exception e) {
         e.printStackTrace();
     }

    
        ResourceBundle rb =
            ResourceBundle.getBundle("LocalStrings",request.getLocale());
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html><html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\" />");

        String title = rb.getString("helloworld.title");

        out.println("<title> Successful submission</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");

        out.println("Employee Data has been inserted");
        out.println("</body>");
        out.println("</html>");
    }
}


