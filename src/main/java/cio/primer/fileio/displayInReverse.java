package cio.primer.fileio;

/**
 * Write a description of class displayInReverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;

public class displayInReverse  
{
    public static void main(String argv[])throws FileNotFoundException
    {
        File file = new File("testFile.txt");
        StringBuffer strBuf = new StringBuffer();
        Scanner in = new Scanner(file);
        while(in.hasNextLine())  {
                
                String line = in.nextLine();
                strBuf.append(line);
        }
        strBuf=strBuf.reverse();
        for(int i=0; i<strBuf.length(); i++){
            System.out.print(strBuf.charAt(i));
        }
    }
}
