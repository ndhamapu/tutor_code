package cio.primer.collection;


/**
 * Write a description of class ArrayListTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ArrayListTest
{
      
    public static void main(String args[]) {
        ArrayList <String> stringList = new ArrayList<String>(); 

        String str = "Item1";
        stringList.add(str); 
        stringList.add(0, "Wadia");
        stringList.add("Item2");    
        stringList.add("Item3"); 
        stringList.add("Item4");
        stringList.add("Item5");
        
        
        int index = stringList.indexOf(str); //location of Item object in List
        System.out.println("Item1 index= " + index);
        //Retrieving Item from ArrayList   
        for (int i = 0; i < stringList.size(); i++){     
            String item = stringList.get(i); 
            System.out.println("Item " + i + " : " + item);
        }
        
        // Using Iterator
         //Iterator<String> itr = stringList.iterator(); //Iterator
         ListIterator<String> itr = stringList.listIterator(); //List Iterator
         //Retrieving Item from ArrayList 	
         while(itr.hasNext()) 
         {
             System.out.println("Item " + itr.next());
         }
        //Removing an item 
        stringList.remove(str);
        System.out.println(stringList);
        //Subset of the list
        List<String> subList = stringList.subList(1, 4);
        System.out.println(subList);
        
    }

}
