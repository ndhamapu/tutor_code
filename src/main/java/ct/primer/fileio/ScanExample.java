package ct.primer.fileio;

/**
 * Write a description of class ScanExample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScanExample
{
     public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("test.txt");
        File fileOut = new File("outScanner.txt");
        Scanner in = new Scanner(file);
        PrintWriter printer = new PrintWriter(fileOut);
        
         while(in.hasNextLine()) {
         //stores each line from file trimmed
         
         String line = in.nextLine();
         System.out.println(line);
         
         Scanner lineS = new Scanner(line);
         String name = lineS.next();
         int age = lineS.nextInt();
         float sal = lineS.nextFloat();
         
         System.out.println("Name=" + name + " age=" + age + " sal=" + sal);
         
         printer.println("Name=" + name + " age=" + age + " sal=" + sal);
      } 
      printer.close();
    }
}
