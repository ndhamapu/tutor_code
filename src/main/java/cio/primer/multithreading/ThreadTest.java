package cio.primer.multithreading;

/**
 * Write a description of class Slip18 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class MyRunnableThread implements Runnable{

    public static int myCount=50;
    MyRunnableThread(){
         
    }
    
    public void run() {
        int index=0;
        while(index <= myCount){
            try{
                System.out.println("Hello Java");
                Thread.sleep(500);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        
        index++;
        }
    }
}
public class ThreadTest {
    public static void main(String a[]){
    	MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
    }
}

