package cio.primer.multithreading;

/**
 * Write a description of class Slip10Q2 here.
 * 1.	Define a thread called “PrintText_Thread�? for printing 
 * text on command prompt for n number of times. Create 
 * two threads and run them. Pass the text and n as parameters to the thread constructor. For Example:
 1. First Thread prints text as�? Gate way Of India�? for 10 
 Times
 2. Second Thread prints text as�? India Gate�? for 20 times
										

 * @author (your name) 
 * @version (a version number or a date)
 */
class printtext implements Runnable{
    String str;
    int num;
    public printtext(String s,int n){
    str=s;
	num=n;
    }
    public void run(){
        
                try{
                
        for(int i=1;i<num;i++)
        {
            System.out.println(str);
            Thread.sleep(3000);
            
        }
    }
    catch (Exception e){
    }
}
}

public class Slip10Q2
{
    public static void main(String args[])
    {
        printtext pt=new printtext(args[0],Integer.parseInt(args[1]));
    Thread t=new Thread(pt);
    t.start();

     printtext pt1=new printtext(args[2],Integer.parseInt(args[3]));
    Thread t1=new Thread(pt1);
    t1.start();
}
    
}
