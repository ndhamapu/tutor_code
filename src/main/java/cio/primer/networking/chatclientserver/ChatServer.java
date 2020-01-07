package cio.primer.networking.chatclientserver;

import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
         
        if (args.length != 1) {
            System.err.println("Usage: java ChatServer <port number>");
            System.exit(1);
        }
         
        int portNumber = Integer.parseInt(args[0]);
         
        try {
            ServerSocket serverSocket =
                new ServerSocket(Integer.parseInt(args[0]));
            Socket clientSocket = serverSocket.accept();     
            PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream(), true);                   
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
	    BufferedReader stdIn =
                new BufferedReader( new InputStreamReader(System.in));
        
            String inputLine;
            while (true) {
            	inputLine = in.readLine();
		System.out.println("Received Text from client:"+ inputLine);
		inputLine = stdIn.readLine(); 
                out.println("Server:" +inputLine);
                out.flush();
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}

