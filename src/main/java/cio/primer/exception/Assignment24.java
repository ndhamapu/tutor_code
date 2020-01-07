package cio.primer.exception;
import java.io.*;
/**
 * Write a description of class Assignment24 here.
 * Write a java program to accept a number from the user, if number is 
 * zero then throw user defined exception “Number is 0�? otherwise check 
 * whether no is prime or not (Use static keyword).
 * @author (your name) 
 * @version (a version number or a date)
 */
class zeroException extends Exception {
    zeroException(){
        super("Error: Number given is zero");
    }
}
public class Assignment24
{
    static boolean isPrime(int num){
        boolean retVal=true;
        for(int i=2; i<num; i++)
        {
             if((num%i)==0)
             {
                 retVal = false;           
             }
        }
        return retVal;
    }
    public static void main(String args[]) throws IOException
    {
        int sum=0;
        while(true) {
            System.out.println("Enter a number");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(in.readLine());
            try{
                if (num == 0)
                    throw new zeroException();
                else {
                    
                    if(isPrime(num) == true){
                        System.out.println("it is a prime number");
                    }
                    else{
                        System.out.println("it is not a prime number");
                    }
                }
            }
            catch(zeroException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        
        }
    }
}
