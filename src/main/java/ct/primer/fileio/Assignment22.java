package ct.primer.fileio;
import java.io.*;
import java.util.*;
/**
 * Write a description of class Assignment22 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *      Write a java program that displays the number 
 *      of characters, lines & words from a file.    
 */
public class Assignment22
{
        public static void main(String args[ ]) throws IOException
         {
        //BufferedReader in = new BufferedReader( new InputStreamReader (System.in)); 
        BufferedReader inputStream = null;

        int chars=0;
        int words=0;
        int lines=0;
        
          try{  
            inputStream = new BufferedReader(new FileReader("inputFile.txt"));
            String strLine;
            while((strLine = inputStream.readLine()) != null){
                lines++;
                chars += strLine.length();
                words += new StringTokenizer(strLine, " ").countTokens();
            }
            System.out.println("Total chars=" + chars);
            System.out.println("Total words=" + words);
            System.out.println("Total Lines=" + lines);
        }
        catch(IOException ie) {
            System.out.println(ie.getMessage());
        }
                
        }

        
}
