package cio.primer.collection;

/**
 * Write a description of class myHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MyHashMap
{
    public static void main(String args[])   {
    HashMap<String, Double> student = new HashMap<String, Double>();
       
       
      student.put("Pratibha", new Double(89.34));
      student.put("Manish", new Double(78.22));
      student.put("Evlon", new Double(95.00));
      student.put("Aditya", new Double(67.22));
      student.put("Sandhya", new Double(34.08));
      
            
      // If you don't want to remove any element while iterating
      for(Map.Entry<String, Double> entry : student.entrySet()){ 
          System.out.printf("Key : %s and Value: %s %n", entry.getKey(), entry.getValue()); 
        }
      
      // If you want to remove element while iterating
      Iterator<Map.Entry<String, Double>> iterator = student.entrySet().iterator();
      
      while(iterator.hasNext()){
            Map.Entry<String, Double> entry = iterator.next();
            
            
            if(entry.getKey().equals("Sandhya"))                                               
                iterator.remove(); // right way to remove entries from Map, 
                               // avoids ConcurrentModificationException
            //System.out.printf("Key : %s and Value: %s %n", entry.getKey(), 
                                                           //entry.getValue());
        }
        iterator = student.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Double> entry = iterator.next();
            
            
            
            System.out.printf("Key : %s and Value: %s %n", entry.getKey(), 
                                                           entry.getValue());
        }



    }
}
