package cio.primer.jdbc;
import java.io.*;
/**
 * Write a description of class Assignment27 here.
 * Write a program in Java to Read ,Update and Delete any record from database. 
 * The database will be created in appropriate backend.
Database about Element ( Oxygen, Hydrogen) has following fields 
( Atomic weight , Name, Chemical symbol)
The input should be provided through Command Line Argument along with 
the appropriate data.
Ex. Java Pgm_name R
Will read and show the contents of the table.
Ex. Java Pgm_name U 10 ’Oxygen’ 137
Will update the record according to the name specified. (JDBC)  
(Use of file handling concept)      
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assignment27
{

    Assignment27() {
    }
    
    public static void main(String args[ ]) throws IOException
    {
        
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        String delims = " ";
        String line;
        String[] tokens;
        StringBuffer strBuf;
        try {

            if(args[0].charAt(0) == 'R') {  // If it is Read
                inputStream = new BufferedReader(new FileReader("Elements.txt"));

                while( (line = inputStream.readLine()) != null )
                {
                    System.out.println(line);
                }
                inputStream.close();
            }
            else if (args[0].charAt(0) == 'U') { // If it is Update
                strBuf = new StringBuffer();
                inputStream = new BufferedReader(new FileReader("Elements.txt"));

                while( (line = inputStream.readLine()) != null )
                {
                    System.out.println("Updating Outside=" + line);
                    tokens = line.split(delims);
                    if(args[2].compareTo(tokens[1]) == 0){ // if Name matches
                        System.out.println("Updating=" + line);
                        strBuf.append(args[1] + " " + args[2] + " " + args[3] );
                        strBuf.append(System.getProperty("line.separator"));
                    }
                    else {
                        strBuf.append(line);
                    }
                }
                inputStream.close();
                outputStream = new PrintWriter(new FileWriter("Elements.txt"));
                outputStream.println(strBuf.toString());
                outputStream.close();
            } else if (args[0].charAt(0) == 'D') { // If it is Delete
                strBuf = new StringBuffer();
                inputStream = new BufferedReader(new FileReader("Elements.txt"));

                while( (line = inputStream.readLine()) != null )
                {
                    
                    tokens = line.split(delims);
                    if(args[2].compareTo(tokens[1]) == 0){ // if Name matches
                        System.out.println("Deleting=" + line);
                        //strBuf(args[1] + " " + args[2] + " " + args[3] + "\n");
                    }
                    else {
                        strBuf.append(line);
                    }
                }
                inputStream.close();
                outputStream = new PrintWriter(new FileWriter("Elements.txt"));
                outputStream.println(strBuf);
                outputStream.close();
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
      }
    }
}
