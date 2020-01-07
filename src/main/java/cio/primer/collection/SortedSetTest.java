package cio.primer.collection;

/**
 * Write a description of class SortedSetTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class SortedSetTest
{
   public static void main(String[] args) {
       
      SortedSet<String> set = new TreeSet<String>(); 
      
      set.add("Zia");
      set.add("Aditya");
      set.add("Sameer");
      
      Iterator it = set.iterator();
      
      while (it.hasNext()) {
         // Get element
         Object element = it.next();
         System.out.println(element.toString());
      }
   }
}
