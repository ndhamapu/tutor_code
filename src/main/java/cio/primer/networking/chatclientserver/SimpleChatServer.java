package cio.primer.networking.chatclientserver;

import java.io.*;
import java.net.*;

public class SimpleChatServer {
    public static void main(String[] args) throws IOException {
         
         
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
            	inputLine = in.readLine();  // Reading from Socket which was sent by client
		System.out.println("Received Text from client:"+ inputLine);
		inputLine = stdIn.readLine();  // Reading from Command prompt
                out.println("Server:" +inputLine); //Writing on to socket for cient to read
                out.flush();
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}

