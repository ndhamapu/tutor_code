package cio.primer.fileio;

/**
 * Write a description of class DataSerialize here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}
public class DataSerialize
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.name = "Ness Wadia";
      e.address = "123 Main Street";
      e.SSN = 11122333;
      e.number = 101;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
