package cio.primer.fileio;

/**
 * Write a description of class CountingWordCharLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class CountingWordCharLine
{
    public static void main(String[]args) throws FileNotFoundException        
    { 
            //Scanner console = new Scanner(System.in);           

            //System.out.println("File to be read: ");
            //String inputFile = console.next();

            File file = new File("testFile.txt");
            Scanner in = new Scanner(file);

            int words = 0;
            int lines = 0;
            int chars = 0;
            while(in.hasNextLine())  {
                lines++;
                String line = in.nextLine();
                for(int i=0;i<line.length();i++)
                {
                    if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
                    chars ++;
                }
                words += new StringTokenizer(line, " ,").countTokens();
            }
            

            System.out.println("Number of lines: " + lines);
            System.out.println("Number of words: " + words);
            System.out.println("Number of characters: " + chars);
    }
}
