package cio.primer.jdbc;

/**
 * Write a description of class JDBCPrepStmt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.sql.*;
import java.util.*;

public class JDBCPrepStmt
{
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
      //  Database credentials
    static final String USER = "system";
    static final String PASS = "system";
   
   
   
   public static void main(String args[]){
       Connection conn = null;
       Statement stmt = null;
       ResultSet rs=null;
       try {
         Class.forName(JDBC_DRIVER);
         //STEP 2: Creating the connection
         conn = DriverManager.getConnection(DB_URL,USER,PASS);
         //STEP 3: Creating a Statement and 
         System.out.println("Creating statement...");
         
      PreparedStatement updateemp = conn.prepareStatement("insert into emp values(?,?,?)");
      updateemp.setInt(1,23);
      updateemp.setString(2,"Tapan");
      updateemp.setString(3, "Prof");
      updateemp.executeUpdate();
      stmt = conn.createStatement();
      String query = "select * from emp";
      rs =  stmt.executeQuery(query);
      System.out.println("Id Name    Job");
      while (rs.next()) {
         int id = rs.getInt("id");
         String name = rs.getString("name");
         String job = rs.getString("job");
         System.out.println(id + "  " + name+"   "+job);
      }      
         
         
        }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
       //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
          se2.printStackTrace();
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
      System.out.println("Goodbye!");
      
   }//end fina
    }
}
