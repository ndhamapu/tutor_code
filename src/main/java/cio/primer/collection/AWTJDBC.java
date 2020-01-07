package cio.primer.collection;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 * Write a description of class AWTJDBC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AWTJDBC extends Frame implements ActionListener
{
    Panel p1;
    TextField t1,t2;
    Label l1,l2;
    Button b1;
    public AWTJDBC()
    {
       l1=new Label("Name");
       l2=new Label("Roll no");
       t1=new TextField(20);
       t2=new TextField(10);
       p1=new Panel();
       b1=new Button("Submit");
       b1.addActionListener(this);
       add(p1);
       p1.add(l1);
       p1.add(t1);
       p1.add(l2);
       p1.add(t2);
       p1.add(b1);
       
    }
    public void actionPerformed(ActionEvent e)
    {
        String rnoo,name;
        int rno;
        rnoo=t2.getText();
        rno=Integer.parseInt(rnoo);
        name=t1.getText();
        System.out.println("Name="+name+ " rollno="+ rno);
         String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
    String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
      //  Database credentials
    String USER = "system";
    String PASS = "system";
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
      //sql = "insert into student values(rno,name)";
      sql = "insert into student values('"+name+"',"+rno+")";
     System.out.println("Statement executed " + sql);
     //STEP 4: Execute a query
            
        stmt.executeUpdate(sql);
        
        
        }
        
        catch(SQLException f){
        f.printStackTrace();
        }
        
        catch(Exception f){
        f.printStackTrace();
        }
   
    }
    public static void main(String args[])
    {
        AWTJDBC a=new AWTJDBC();
        a.setVisible(true);
        a.setSize(300,300);
        
    }
    
}
