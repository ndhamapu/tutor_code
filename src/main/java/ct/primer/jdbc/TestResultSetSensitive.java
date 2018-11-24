package ct.primer.jdbc;
import java.sql.*;
import java.util.*;
/**
 * Write a description of class TestResultSetSensitive here.
 * Here if the DB is changed after getting ResultSet object and RS is open then RS 
 * value will also change.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestResultSetSensitive
{
   static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
   static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
      //  Database credentials
   static final String USER = "system";
   static final String PASS = "system";
   
   public static void main(String[] args) {
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
      stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      String sql;
      sql = "select name from student where rollno=111";
     System.out.println("Statement executed " + sql);
     //STEP 4: Execute a query
     ResultSet rs = stmt.executeQuery(sql);
     
      //STEP 5: Extract data from result set
    rs.next();
    System.out.println("Student Name: " + rs.getString("name"));
    Thread.sleep(30000); // Modify the name value in Oracle manually and commit;
    
    rs.refreshRow();
    System.out.println("Student Name: " + rs.getString("name"));

        
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
   }//end finally
   System.out.println("Goodbye!");
}//end main
}
