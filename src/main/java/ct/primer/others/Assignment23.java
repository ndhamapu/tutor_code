package ct.primer.others;
import java.io.*;
/**
 * Write a description of class Assignment23 here.
 * Write a java program that reads line of integers. Display each 
 * integer and also display sum of all integers
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assignment23
{
    public static void main(String args[]) throws IOException
    {
        int sum=0;
        System.out.println("Enter the Numbers to be read");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strLine = in.readLine();
        String delims = "[ ]";
        String[] tokens = strLine.split(delims);
        
        System.out.println("Numbers entered are ");
        for(int i=0; i<tokens.length; i++){
            System.out.print(tokens[i] + " ");
            sum += Integer.parseInt(tokens[i]);
        }
        System.out.println();
        System.out.println("Sum of the Numbers =" + sum);
    }
}
