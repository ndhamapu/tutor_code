package ct.primer.fileio;
import java.nio.*;
import java.nio.file.*;

import java.io.*;
public class FileCopy
{
    public static void main(String args[])throws IOException
    {
        //Copying a directory or file
        File src = new File("original.txt");
        File target = new File("copy.txt");

        Files.copy(src.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
        
    }
}
