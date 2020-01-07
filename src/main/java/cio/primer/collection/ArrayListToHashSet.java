package cio.primer.collection;

import java.util.*;
 class AStudent implements Comparable<AStudent>
{
    String name;
    public AStudent(String nm)
    {
        name=nm;
    }
    public int compareTo(AStudent obj){
        //System.out.println("In compareTo "+this.name);
        //int retVal= obj.name.compareTo(this.name);
        //System.out.println("retVal in compareTo "+retVal);
        //return retVal;
        return obj.name.compareToIgnoreCase(this.name);
        
    }
    public int hashCode(){
        //System.out.println("In hashcode");
        int hashcode = name.hashCode()*20;
        
        return hashcode;
    }
    public String toString()
    {
        return("Name = " + name);
    }
    
}

public class ArrayListToHashSet
{
    public static void main(String argc[])
    {
        ArrayList<AStudent> l= new ArrayList<AStudent>();
        
        l.add( new AStudent("Rukaiya"));
        l.add(new AStudent("Zema"));
        l.add(new AStudent("Rukaiya"));
        l.add(new AStudent("Sharina"));
        l.add(new AStudent("Rukaiya"));
        l.add(new AStudent("Arshiya"));
    
        ListIterator<AStudent> itr= l.listIterator();
        while(itr.hasNext())
        {
            System.out.println("Item " + itr.next());
        }   
        
        // Removing duplicates and sorting in decending order
        TreeSet<AStudent> t=new  TreeSet<AStudent>(l);
        System.out.println("Item in decending order are " + t);
        
    }
}



