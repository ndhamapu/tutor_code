package cio.primer.multithreading;

class transaction
{
    static int bal=0;
    static int withdraw1=0;
    static int deposit=0;
    
    public synchronized void withdraw(int wamt)
    {
        try
        {
            withdraw1=wamt;
            if(bal>=withdraw1)
            {
                bal-=withdraw1;
                System.out.println("Amount Withdrawn. New Balance: "+ bal);
            }
            else
            {
                System.out.println("Amount to Withdraw is "+ withdraw1 );
                System.out.println("Current Balance: "+ bal);
                System.out.println("Going into wait state ...");
                wait();
            }
            bal-=withdraw1;
            System.out.println("Amount Withdrawn " + withdraw1 + ". New Balance: "+ bal);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }   
    
    public  synchronized void deposit(int damt)
    {
        try
        {
            deposit=damt;
            while(bal<withdraw1)
            {
                bal=bal+deposit;
                System.out.println("After Deposit Current balance is "+bal);
                Thread.sleep(2000);
            }
            if(bal>=withdraw1)
            {
                System.out.println("Balance is available for withdraw " + bal);
                System.out.println("Sending notifyAll ....");
                notifyAll();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
    }
}

public class ThreadSync extends Thread
{
    public static void main(String args[])
    {
        final transaction t= new transaction();
        Thread t1= new Thread(){
           public void run(){
               t.withdraw(5000);
            } };
        Thread t2= new Thread(){
            public void run(){
                t.deposit(1000);
            }};
          t1.setName("WithdrawThread");
          t2.setName("DepositThread");
          t1.start();
          t2.start();
    }
}
