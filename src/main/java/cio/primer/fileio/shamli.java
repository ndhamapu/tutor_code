package cio.primer.fileio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class shamli
{
    public static void main(String args[])
    {
        FileInputStream in;
        FileOutputStream out;
        
        int r;
        try{
            in=new FileInputStream("TyBcain.txt");
        out=new FileOutputStream("tybcaout.txt");
        while((r=in.read())!=-1){
        out.write(r);
        
    
        }
    }
    catch(IOException e){}
    }
}