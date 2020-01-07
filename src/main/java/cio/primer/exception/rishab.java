package cio.primer.exception;
import java.util.Scanner;
class rishabexception extends Exception

{
   rishabexception()
   {
       System.out.println("age less than 15 or greater than 24");
    
   }
}
public class rishab
{
    public static void main(String args[])
    {
        try{
       int n; 
       System.out.println("enter age");
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       System.out.println("age" + n);
       if(n<15)
       { 
        System.out.println("Age less than 15");
        throw new rishabexception();
       }
       else if (n > 24)
       { 
           System.out.println("Age is more than 24");
           throw new rishabexception();
       }}
       catch(rishabexception e){e.printStackTrace();}
    }
}