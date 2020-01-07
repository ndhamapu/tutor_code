package cio.primer.collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
/**
 * Write a description of class LinkedListHashExam here.
 * Write a Java program to implement following options on 
 * LinkedList using collections
      	          1) Intersection
     	          2) Concatenation
                    3) Display

 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedListHashExam
{
    public static LinkedHashSet<String> intersect(LinkedHashSet<String> hset1, 
                        LinkedHashSet<String> hset2){
    LinkedHashSet<String> tmp = new LinkedHashSet<String>();  
    for (String x : hset1)
      if (hset2.contains(x))
        tmp.add(x);
    return tmp;

    }
    public static void main(String args[]) {
        LinkedHashSet<String> dset1 = new LinkedHashSet<String>();
        dset1.add("David"); dset1.add("Joe");dset1.add("Robert");
        dset1.add("Robert"); // Second Robert will not be added
        dset1.add("Susan"); 
        
        LinkedHashSet<String> dset2 = new LinkedHashSet<String>();
        dset2.add("Pratibha"); dset2.add("David");dset2.add("Sandhya");
        dset2.add("Aditya"); dset2.add("Susan"); 
        
        
        LinkedHashSet<String> dset3 = new LinkedHashSet<String>();
        dset3.addAll(dset1); // Concatenation
        dset3.addAll(dset2); // Concatenation
        Iterator<String> iterator = dset3.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("After Intersection");
        LinkedHashSet<String> lset = intersect(dset1, dset2);
        Iterator<String> iterator1 = lset.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
    }
}
