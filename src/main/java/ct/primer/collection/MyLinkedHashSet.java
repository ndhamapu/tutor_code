package ct.primer.collection;

/**
 * Write a description of class MyLinkedHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MyLinkedHashSet
{
       public static void main(String a[]){
         
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("second");
        lhs.add("third");
        System.out.println(lhs);
        System.out.println("LinkedHashSet size: "+lhs.size());
        System.out.println("Is LinkedHashSet emplty? : "+lhs.isEmpty());
        Iterator<String> itr = lhs.iterator(); 
        while(itr.hasNext()){ 
            System.out.println(itr.next()); 
        } 
       }
}
