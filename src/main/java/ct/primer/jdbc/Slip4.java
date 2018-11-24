package ct.primer.jdbc;
import java.sql.*;

public class Slip4
{
   static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
   static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
      //  Database credentials
   static final String USER = "system";
   static final String PASS = "system";
   public static void main(String[] args) {
   Connection conn = null;
   PreparedStatement ps = null;
   
   try{
       // STEP 1: Registering with JDBC driver for Oracle
       Class.forName(JDBC_DRIVER);
      //STEP 2: Creating the connection
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      //STEP 3: Creating a Statement and 
      System.out.println("Creating statement...");
      if(conn == null)
        System.out.println("Connection failed");
        
        ps=conn.prepareStatement("insert into student values(?,?)");
        ps.setString(1,"cmpunk");
        ps.setInt(2,16);
   ps.executeUpdate();
}catch(Exception e)
{
   e.printStackTrace(); 
}
}
}