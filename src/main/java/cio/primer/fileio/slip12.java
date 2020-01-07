package cio.primer.fileio;
import java.io.File;
class slip12
{
    public static void main(String args[])
    {
        try
        {
        String a;
        for(int i=0;i<args.length;i++)
        {
            a=args[i];
            String arr[];
            arr=a.split("\\.");
            System.out.println(a);
            System.out.println(arr[1]);
            if(arr[1].equals("txt"))
            {
                File f=new File(a);
                f.delete();
        }
    }
}
    catch(Exception e)
    {
    }
}
}