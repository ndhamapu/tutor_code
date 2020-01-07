package cio.primer.collection;

import java.util.*;

/**
 * Write a description of class HashTableImpl here.
 * Using Class implement Hash table to
1)  Accept ‘n’ records of students (Name, Percentage) 
2)  Display details of all students
Find out highest marks

 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashTableMCA
{
   public static void main(String args[])   {
       Hashtable student = new Hashtable();
       Enumeration names;
       String name, maxName="Not Found";
       double percentage, maxPer=0.0;
       //Object put(Object key, Object value)
      student.put("Pratibha", new Double(89.34));
      student.put("Manish", new Double(78.22));
      student.put("Evlon", new Double(95.00));
      student.put("Aditya", new Double(67.22));
      student.put("Sandhya", new Double(34.08));
      
            // Show all balances in hash table.
      names = student.keys();
      while(names.hasMoreElements()) {
         name = (String) names.nextElement();
         percentage = (Double)student.get(name);
         if(maxPer < percentage){
             maxPer = percentage;
             maxName = name;
            }
         System.out.println(name + ": " + student.get(name));
      }
      System.out.println();
      System.out.println(maxName + " has got highest percentage=" +
                maxPer);
      


   }
}
