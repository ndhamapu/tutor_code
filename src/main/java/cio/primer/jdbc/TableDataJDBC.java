package cio.primer.jdbc;

/**
 * Write a description of class TableDataJDBC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.sql.*;
import java.util.*;
public class TableDataJDBC
{
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
      static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
      //  Database credentials
      static final String USER = "system";
      static final String PASS = "system";
      
      public static void main(String args[]){
          Connection conn=null;
          Statement stmt=null;
        try{
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();   
                String sql = "SELECT  column_name, data_type from user_tab_columns where table_name='" +  args[0] +"'";
 
                System.out.println("Statement executed " + sql);
                ResultSet rs= stmt.executeQuery(sql);
                while(rs.next()) {
                    String colName = rs.getString("column_name");
                    String dType = rs.getString("data_type");
                    System.out.println("colName=" + colName + " Data Type=" + dType);
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
