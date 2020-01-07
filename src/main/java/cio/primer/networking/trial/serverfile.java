package cio.primer.networking.trial;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  


public class serverfile
{
	public static void main(String args[])throws UnknownHostException,IOException
	{
		try
		{
		ServerSocket ss=new ServerSocket(8089);
		System.out.println("Server Started");
		Socket s=ss.accept();
		System.out.println("Connected to Client");
		BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));
		BufferedReader stdIn =new BufferedReader( new InputStreamReader(System.in));
		//PrintWriter pw=new PrintWriter(s.getOutputStream());
        	String inputLine;
            	while (true) 
		{
            		inputLine = in.readLine();
			System.out.println("Received Text from client:"+ inputLine);
			Date date = new Date();  
    			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
    			String strDate= formatter.format(date);  
    			System.out.println(strDate);  
                	//pw.println(strDate);
            	}
        	} catch (IOException e) 
		{
            		System.out.println("Exception caught when trying to listen on port or listening for a connection");
            		System.out.println(e.getMessage());
        	}
    	}
}