package cio.primer.exception;
import java.io.*;
/**
 * Write a description of class Assignment28 here.
 * Write a class Student with attributes roll no, name, age and course. 
 * Initialize values through parameterized constructor. If age of student
 * is not in between 15 and 21 then generate user-defined exception 
 * “Age Not Within The Range�?.If name contains numbers or special symbols 
 * raise exception “Name not valid�?. 
 * @author (your name) 
 * @version (a version number or a date)
 */
class ageException extends Exception{
    ageException(){
        System.out.println("Age Not Within The Range");
    }
}
class nameException extends Exception{
    nameException(){
        System.out.println("Invalid characters in name");
    }
}
class Student{
    int rollNo;
    String name;
    int age;
    String course;
    
    Student(int rNo, String nm, int ag, String cr){
        rollNo=rNo;
        name=nm;
        age=ag;
        course=cr;
    }
    void display() {
        System.out.println("Student rollNo=" + rollNo + " name=" + name
                            + " age=" + age + " course=" + course);
    }   
}

public class Assignment28
{

    public static void main(String args[]){
            int rollNoL;
            String nameL;
            int ageL;
            String courseL;
            String regex=".*\\d+.*";
        try{
            rollNoL = Integer.parseInt(args[0]);
            nameL = args[1];
            ageL = Integer.parseInt(args[2]);
            courseL = args[3];
            if(ageL < 15 || ageL > 21) 
                throw new ageException();
            if(nameL.matches(regex))
                throw new nameException();
            Student std = new Student(rollNoL,nameL,ageL,courseL ); 
            std.display();
        }
        catch(ageException e1){
        }
        catch(nameException e1){
        }
    }
}
