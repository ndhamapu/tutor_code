package ct.primer.collection;

/**
 * Write a description of class myHashSetLarge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;

public class MyHashSetLarge
{
    public static void main(String args[]) throws IOException
    {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        Integer inte;
        
            for(int i=0; i< 5000000; i++){
                inte = new Integer(i);
                hs.add(inte);
            }
        System.out.println("done with insertion");
    
        
        /*
        Iterator iter = hs.iterator();      
        while (iter.hasNext()){ 
             str = (String) iter.next();
             System.out.println("name="+str);
        }
        */
    }
}
