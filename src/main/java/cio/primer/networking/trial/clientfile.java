package cio.primer.networking.trial;
import java.io.*;
import java.net.*;
public class clientfile
{
	public static void main(String args[])throws UnknownHostException,IOException
	{
		 try 
		{
			Socket s=new Socket("localhost",8089);	
			PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            		BufferedReader in =new BufferedReader( new InputStreamReader(s.getInputStream()));
            		BufferedReader stdIn =new BufferedReader( new InputStreamReader(System.in));
            		String userInput;
            		while (true) 
			{
            			userInput = stdIn.readLine();
				out.println(userInput);
                		System.out.println(in.readLine());
			}
		} catch (UnknownHostException e) {
            	System.err.println("Don't know about host ");
            	System.exit(1);
        	} catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection");
            System.exit(1);
        } 	
	}
}