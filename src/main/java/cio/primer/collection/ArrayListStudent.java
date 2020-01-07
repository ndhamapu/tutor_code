package cio.primer.collection;


/**
 * Write a description of class ArrayListStudent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
class Student
{
    String name;
    int roll;
    String addr;
    
    Student(String name, int roll, String addr) {
        this.name=name;
        this.roll=roll;
        this.addr=addr;
    }
    
    public String toString() { 
         return "name=" + this.name + " roll=" + this.roll + " addr=" + this.addr;
      } 
    
}

public class ArrayListStudent
{
    public static void main(String args[]) {
        ArrayList<Student> studList = new ArrayList<Student>();
        
        studList.add(new Student("Puja", 111, "Pune"));
        studList.add(new Student("Kumar", 222, "Mumbai"));
        Student stu = new Student("Naman", 333, "Jamnagar");
        studList.add(stu);
        //studList.add(3, null);
        
        if(studList.contains(stu))
            System.out.println("Naman already exists in the list");
        else 
            studList.add(new Student("Naman", 333, "Jamnagar"));
        
        
        ListIterator<Student> itr = studList.listIterator();
        while(itr.hasNext()) 
         {
             System.out.println("Item " + itr.next());
         }
        //System.out.println(studList);
    }
        

    
    
    
}