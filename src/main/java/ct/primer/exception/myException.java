package ct.primer.exception;

/**
 * Write a description of class ExceptionTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.*;

class harshada extends Exception{
    harshada(){
        System.out.println("Harshada didn't understand Exception");
    }
}
public class myException
{
   
public static void main(String args[]) {
    try {
            int a = args.length;
            int b = 42 / a;
           System.out.println("a = " + a);
           if(a == 1)
            throw new harshada();
           
        } 
        
        
        catch(harshada e) {
            System.out.println("Arith Divide by 0: " + e);
            
        }
        catch(Exception e) {
            //System.out.println("Excep Divide by 0: " + e);
        }
        finally{
            System.out.println("I am in finally block");
        }
}
}

