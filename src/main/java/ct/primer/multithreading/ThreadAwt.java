package ct.primer.multithreading;

/**
 * Write a description of class ThreadAwt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;

class myThread implements Runnable{
    TextField tf;
    private volatile boolean threadStop=false;
    myThread(TextField tf1){
        tf=tf1;
        //threadStop=false;
    }
    public synchronized void stop(){
        Thread.currentThread().interrupt();
        System.out.println("Flag has been set to true");
    }
    public void run(){
        System.out.println("Thread Stop="+threadStop);
        while(threadStop==false) {
            try{
                tf.setText("Thread Start");
                System.out.println("Starting Thread");
                Thread.sleep(1500);
            } catch(InterruptedException ie){
                System.out.println("Thread interrupted...");  
                threadStop=true;
            }
        }
    }
}
public class ThreadAwt extends Frame implements ActionListener
{
    TextField tf;
    Button b1, b2;
    Panel p1;
    Thread t1;
    myThread m1;
    
    public ThreadAwt()
    {
        p1 = new Panel();
        b1 = new Button("Start");
        b2 = new Button("Stop");
        tf = new TextField(10);
        b1.addActionListener(this);
        b2.addActionListener(this);
        p1.add(tf);
        p1.add(b1);
        p1.add(b2);
        setSize(200, 400);
        add(p1);
        
        m1 = new myThread(tf);
        t1 = new Thread(m1);
        
    }
    
    public  void  actionPerformed(ActionEvent e)
    {
        Button localBtn=(Button) e.getSource();
        
       
        if(localBtn == b1) {
            System.out.println("Button Start");
            t1.start();
        }
        else {
            System.out.println("Button Stop");
            try{
            t1.suspend();
            //t1.join();
            }catch(Exception es){System.out.println("Exception handled "+es);}
        }
        
    }
    
    public static void main(String args[]){
        ThreadAwt ne = new ThreadAwt();
        ne.setVisible(true);
    }
}
