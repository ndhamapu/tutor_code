package cio.primer.fileio;
import java.io.*;
/**
 * Write a description of class Assignment29 here.
 * Write a Java program to accept list of files as command line 
 * arguments. Display the name and size of all the files. Delete 
 * all files with extension as ‘.html’ from the current directory. 
 * Appropriate error messages should be printed.(Use vector Array)
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assignment29
{
    public static void main(String args[]){
        File file;
        System.out.println("args length=" + args.length);
        for(int i=0; i< args.length; i++) {
            
            file = new File(args[i]);
            if(file.isFile()){
                System.out.println("file=" + args[i] + " size=" + file.length());
                String[] tokens = args[i].split("\\.");

                if(tokens[1].compareTo("html") == 0)
                {
                    System.out.println(" deleting file=" + args[i]);
                    file.delete();
                }
            
            }
            else 
            System.out.println("Error: The string " + args[i] + " is not a file name");
        }
        
        
    }
}
