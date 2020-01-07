package cio.primer.multithreading;

/**
 * Write a description of class ThreadExample1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

class separateThread implements Runnable{
 
    public static int myCount = 0;
    public separateThread(){
         
    }
    public void run() {
        while(separateThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++this.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
}
public class ThreadExample1 {
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        separateThread mrt = new separateThread();
        Thread t = new Thread(mrt);
        t.start();
        Thread t1 = new Thread(mrt);
        t1.start();
        int count=0;
        while(count <= 10){
            try{
                System.out.println("Main Thread: "+(count));
                Thread.sleep(500);
                count++;
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
