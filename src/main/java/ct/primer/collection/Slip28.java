package ct.primer.collection;
/*
Slip# 28
Q1. Write a java program to read n Students names from user, 
store them into the ArrayList collection. The program should 
not allow duplicate names. Display the names in 
Ascending order.  
*/
import java.util.*;
public class Slip28 {
    
    public static void main(String args[]) {
        ArrayList<String> stuList = new ArrayList<String>();
        stuList.add("Harpreet"); 
        stuList.add("Rinku"); 
        stuList.add("Tinku");
        stuList.add("George");
        stuList.add("Chandni");
        stuList.add("Tinku");
        
        // Using  Iterator
        Iterator itr = stuList.iterator(); 
        
        while (itr.hasNext()) {
                System.out.println(itr.next()); 
        }
        
        // Now sorting and desending order will be done 
        // by using TreeSet
        TreeSet<String> tSet = new TreeSet<String>(stuList);
        System.out.println(tSet);
        
    }
}