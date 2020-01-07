package cio.primer.fileio;
import java.io.*;

public class RandomAccessEx
{
    public static void main(String args[]){
        try
        {
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            String str1="Hello Random World";
            raf.write(str1.getBytes());
            // set the file pointer at 0 position
            raf.seek(0);

            // print the string
            byte[] bytes = new byte[40];
            raf.read(bytes);
            System.out.println("" + new String(bytes));
            
            raf.seek(5);
            String str2 = "Mumbai";
            raf.write(str2.getBytes());
            
            raf.seek(0);
            bytes = new byte[40];
            raf.read(bytes);
            System.out.println("" + new String(bytes));
            
            raf.close();
        }
        catch(IOException ioe)
        {
            //System.err.println("IOException: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
