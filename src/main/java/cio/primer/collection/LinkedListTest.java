package cio.primer.collection;

/**
 * Write a description of class LinkedListTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class LinkedListTest
{
    public static void main(String args[]) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("Item1"); 
        myList.add("Item2"); 
        myList.add("Item3"); 
        myList.addLast("Z"); 
        myList.addFirst("A"); 
        myList.add(1, "A2"); 
        myList.remove("Z"); //Removing an item
        //Using For loop
        for (int i = 0; i < myList.size(); i++){     
            String item = myList.get(i); 
            System.out.println("Item " + i + " : " + item);
        }
        
        // Using Descending Iterator
        Iterator dItr = myList.descendingIterator(); //last to firstIterator
        
        while (dItr.hasNext()) {
                System.out.println(dItr.next()); 
        }
        // Using List Iterator
        ListIterator lItr = myList.listIterator(0); 
        if(lItr.hasPrevious())
            System.out.println("Previous Element is present");
        else
            System.out.println("Previous Element is not present");
        while (lItr.hasNext()) {
                System.out.println(lItr.next()); 
        }
        
    // Get & Set Method
        Object val = myList.get(2); 
        myList.set(2, (String) val + " Changed");
        myList.add(1, "A9");
        myList.add(1, "A6");
        TreeSet<String> tSet = new TreeSet<String>(myList);
        System.out.println(tSet);
    }

}
