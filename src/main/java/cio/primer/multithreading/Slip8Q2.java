package cio.primer.multithreading;

/**
 * Write a description of class Slip8Q2 here.
 * 2.   Write a JAVA program which will generate following threads
            To display 10 terms of Fibonacci series.
To display 1 to 20 in reverse order
 * @author (your name) 
 * @version (a version number or a date)
 */



class fibo implements Runnable{
    public void run(){
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        try{
                
        for(int i=1;i<20;i++)
        {int c=a+b;
            System.out.println(c);
            Thread.sleep(3000);
            a=b;
            b=c;
        }
    }
    catch (Exception e){
    }
}
}

class count implements Runnable{
    public void run(){
       
        try{
                
        for(int i=20;i>0;i--)
        {
            System.out.println(i);
            Thread.sleep(3000);
           
          
        }
    }
    catch (Exception e){
    }
}
}
public class Slip8Q2
{
    public static void main(String agrs[])
    {
  count c1=new count();
  fibo c2=new fibo();
  Thread t1=new Thread(c1);
  Thread t2=new Thread(c2);
  t1.start();
  t2.start();
    
}}