package ct.primer.fileio;
import java.io.*;  

public class FileClass
{
    public static void main(String[] ar)throws IOException
    {
        String s="fileinput.txt";
        File file = new File(s);
        
        if(!file.exists()){
            file.createNewFile(); 
        }
        else {
            System.out.println("file " + s + " exist");
        }
        
        FileWriter fw=new FileWriter(file);
        fw.write("This is test only on File class");
        fw.close();
    }
}
