package ct.primer.fileio;
import java.io.*;
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