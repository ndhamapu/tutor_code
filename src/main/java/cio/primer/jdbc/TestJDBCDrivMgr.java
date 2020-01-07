package cio.primer.jdbc;
import java.sql.*;
/**
 * Write a description of class TestJDBC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestJDBCDrivMgr
{
   static final String MYSQLJDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String MYSQLDB_URL = "jdbc:mysql://localhost/mynewdatabase";
      //  Database credentials
   static final String MYSQLUSER = "root";
   static final String MYSQLPASS = "root";
   

   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   
   try{
      //STEP 2: Register JDBC driver
      //Class.forName("com.mysql.jdbc.Driver");
      // Or
      //Driver myDriver = new com.mysql.jdbc.Driver();
      //DriverManager.registerDriver( myDriver ); 
      //System.out.println("Driver connector has been registered");
      
      //STEP 3: Open a connection
      // You may not need the registration code above if it is
      // Java 6 or more
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(MYSQLDB_URL,MYSQLUSER,MYSQLPASS);

      //STEP 4: Creating a Statement and Execute a query
      System.out.println("Creating statement...");
      if(conn == null)
        System.out.println("Connection failed");
      stmt = conn.createStatement();
      String sql;
      
      
      sql = "SELECT counselor_id, first_name, last_name, telephone FROM counselor";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
          int id  = rs.getInt("counselor_id");
         
         String first = rs.getString("first_name");
         String last = rs.getString("last_name");
         String telephone = rs.getString("telephone");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", First: " + first);
         System.out.print(", Last: " + last);
         System.out.println(", telephone: " + telephone);
      }
      //STEP 6: Clean-up environment
      
        
      rs.close();
      stmt.close();
      conn.close();
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
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end FirstExample



