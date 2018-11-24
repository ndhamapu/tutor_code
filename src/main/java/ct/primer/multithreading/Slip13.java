package ct.primer.multithreading;

/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Fibonacci implements Runnable
{ 	
	int a=1,b=1,c=1;
	public Fibonacci()
	{
         
	}

	public void run() 
	{
		
		System.out.println("Current Thread - START "+Thread.currentThread().getName());
		System.out.println("\nCurrent Thread: "+a);
		System.out.println("\nCurrent Thread: "+b);
		while(c<=80)
		{
			c=a+b;
			System.out.println("\nThread: "+c);
			a=b;
			b=c;
		}
		try
		{
			Thread.sleep(1500);
		}
      
		catch (InterruptedException iex) 
		{
			System.out.println("Exception in thread: "+iex.getMessage());
		}
		System.out.println("Thread END");
        	}
}	
       
class Reverse implements Runnable
{ 	
	int i;
	public Reverse()
	{
         
	}

	public void run() 
	{
		System.out.println("Current Thread - START "+Thread.currentThread().getName());
		for(i=20;i>=1;i--)
		{
			try
			{
				
				Thread.sleep(1000);
			}
      
			catch (InterruptedException iex) 
			{
				System.out.println("Exception in thread: "+iex.getMessage());
			}
			System.out.println("Thread: "+i);
		}
		System.out.println("Thread END");
        	}
}	
       

public class Slip13 
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Starting Main Thread...");
			Fibonacci f=new Fibonacci();
			Thread th1=new Thread(f);
			th1.start();
			
			Reverse r=new Reverse();
			Thread th2=new Thread(r);
			//th2.setPriority(10);
			th2.start();
			Thread.sleep(1000);
		}
		 catch (InterruptedException iex)
		{
			System.out.println("Exception in main thread: "+iex.getMessage());
            		}
		 System.out.println("End of Main Thread...");
	}
}