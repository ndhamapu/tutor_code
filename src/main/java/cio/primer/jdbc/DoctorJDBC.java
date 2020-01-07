package cio.primer.jdbc;
import java.sql.*;
import java.util.*;
/**
 * Write a description of class DoctorJDBC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoctorJDBC
{

        
      static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
      static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
      //  Database credentials
      static final String USER = "system";
      static final String PASS = "system";
   
   Connection conn = null;
   Statement stmt = null;
   
   public Object[][] getDoctorData(){
       
   Object[][] dataO, nullO;
   nullO = new Object[3][];
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
      sql = "select count(*) from doctor";
      System.out.println("Statement executed " + sql);
      ResultSet rs = stmt.executeQuery(sql);
      
      int noOfROws=0;
      int index=0;
      rs.next();
      noOfROws=rs.getInt(1);
      System.out.println("Record count=" + noOfROws);
      dataO = new Object[noOfROws][];
     
      
      sql = "select * from doctor";
      System.out.println("Statement executed " + sql);
      //STEP 4: Execute a query
       rs = stmt.executeQuery(sql);
      
     
      //STEP 5: Extract data from result set
      String DName;
      int DNo, sal;
      
      while(rs.next()){
          DNo = rs.getInt("DNo");
          DName = rs.getString("DName");
          sal = rs.getInt("Sal");
          System.out.println("DNo=" + DNo + " DName=" + DName + " Salary="+ sal);
          dataO[index]=new Object[]{new Integer(DNo), DName, new Integer(sal)};
          index++;
        }
        
      rs.close();
      stmt.close();
      conn.close();
      return dataO;
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
      
   }//end finally
   return nullO;
   
    }
}
