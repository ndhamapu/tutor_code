package cio.primer.collection;
// union implementation in List will keep the duplication
// but in Set duplication will be removed.

import java.util.*;

public class UnionNIntersectionOfList
{
    public static void main(String args[]){
        Collection<String> col1 = new LinkedList<String>(); // {a, b, c}
        
        col1.add("a");
        col1.add("b");
        col1.add("c");

        Collection<String> col2 = new LinkedList<String>(); // {b, c, d, e}
        
        col2.add("b");
        col2.add("c");
        col2.add("d");
        col2.add("e");

        col1.addAll(col2); //Union actually concatenation
        System.out.println(col1); 
        
        Collection<String> col4 = new LinkedList<String>(); // {a, b, c}
        
        col4.add("a");
        col4.add("b");
        col4.add("c");
        
        Collection<String> col3 = new LinkedList<String>(); 
        col3.add("b");
        col3.add("c");
        col3.add("d");
        col3.add("e");
        col4.retainAll(col3); // Intersection
        System.out.println(col4); 
    }
}
