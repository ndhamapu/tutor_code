package cio.primer.jdbc;
import java.sql.*;
import java.util.*;

public class CustPrep
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
         PreparedStatement updatecust = conn.prepareStatement("insert into cust values(?,?,?,?)");
         Scanner sc=new Scanner(System.in);
         int cid,phno;
         String cname,caddr;
         cid=sc.nextInt();
         phno=sc.nextInt();
         cname=sc.next();
         caddr=sc.next();
         updatecust.setInt(1,cid);
         updatecust.setInt(2,phno);
         updatecust.setString(3,cname);
         updatecust.setString(4,caddr);
         updatecust.executeUpdate();
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
         
         
         
         