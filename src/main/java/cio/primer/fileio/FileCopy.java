package cio.primer.fileio;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
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
