package ct.primer.fileio;
import java.util.Scanner;
import java.io.*;          

/**
 * Write a description of class ScannerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScannerTest
{
     public static void main(String[] args)
  {
    // Declarations
    Scanner in = new Scanner(System.in);
    int integer;
    long longInteger;
    float realNumber;
    double doubleReal;
    String string1;
    String string2;
    
        // Read in values   
        System.out.println("Enter an integer, a long integer, "
                        + "a floating-point and a string");
    //in.useDelimiter("\\s*,\\s*");                       
    integer = in.nextInt();
    longInteger = in.nextLong();
    realNumber = in.nextFloat();
    string1 = in.next();
    System.out.println("Name=" + string1 + " salary=" + realNumber + " age=" +
                integer + " phone number=" + longInteger );

}
}
