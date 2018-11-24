package ct.primer.fileio;
import java.io.*;

public class FileAppend
{
    public static void main(String args[]){
        try
        {
                String filename= "myfile1.txt";
                FileWriter fw = new FileWriter(filename,true); //the true will append the new data
                fw.write("add a line");//appends the string to the file
                fw.close();
                
                FileWriter fw1 = null;
                BufferedWriter bw = null;
                PrintWriter out = null;
                fw1 = new FileWriter("myfile2.txt", true);
                bw = new BufferedWriter(fw1);
                out = new PrintWriter(bw);
                out.println("the text line");
                out.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
