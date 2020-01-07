package cio.primer.fileio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Write a description of class FileIOClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AWT
{
        public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;


    try {
            int c;
            in = new FileInputStream("inputFile.txt");
            out = new FileOutputStream("outputFile.txt");
            while((c=in.read())!= -1){
                 out.write(c);
            }
        }
        catch(IOException e){
        }
    }
}
