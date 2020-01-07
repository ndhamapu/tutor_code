package cio.primer.multithreading;

/**
 * Write a description of class Slip4Q1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slip4Q1 extends Thread
{
    String s1;
    public Slip4Q1(String str)
    {
            super(str);
            s1=str;
    }
    
    public void run()
    {
        int i;
        try
        {
            for(i=0;i<10;i++)
            {
            System.out.println(s1);
            Thread.sleep(3000);
        }
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }
    public static void main(String args[])
    {
        Slip4Q1 t1=new Slip4Q1("MCA");
        Slip4Q1 t2=new Slip4Q1("Commerce");
        t1.start();
        t2.start();
    }
}
