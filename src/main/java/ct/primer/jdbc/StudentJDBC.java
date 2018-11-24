package ct.primer.jdbc;
import java.sql.*;
import java.util.*;
class zeroRollNoException extends Exception{
    zeroRollNoException(){
        System.out.println("Roll No given is zero");
    }
}
public class StudentJDBC
{
      static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
      static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
      //  Database credentials
      static final String USER = "tmondal";
      static final String PASS = "pass";
      
      public static void main(String args[]){
          Connection conn=null;
          Statement stmt=null;
        try{
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();
                if(Integer.parseInt(args[0]) == 0){
                    throw new zeroRollNoException();
                }
                else {      
                    String sql = "insert into student (Stud_rno, Stud_Name, Stud_per) values('" + args[0] + "', '"+ args[1]+ "', "+args[2]+")"; 
                    System.out.println("Statement executed " + sql);
                    int rowCount = stmt.executeUpdate(sql);
                }
            }
            catch(Exception se){
                se.printStackTrace();
            }
            finally{
                try{
                    if(stmt!=null)
                        stmt.close();
                    if(conn != null)
                        conn.close();
                }
                catch(Exception se){
                    se.printStackTrace();
                }
            }
        }
}
