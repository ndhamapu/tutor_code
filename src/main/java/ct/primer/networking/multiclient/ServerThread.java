package ct.primer.networking.multiclient;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {

    private Socket socket = null;
    private String s;

    public ServerThread(Socket s) {
        socket = s;

    }

    public void run() {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);                   
            BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()));
	    BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in));
		 String inputLine;
            while (true) {
            	inputLine = in.readLine();  // Reading from Socket which was sent by client
		System.out.println("Received Text from client:"+ inputLine);
		inputLine = stdIn.readLine();  // Reading from Command prompt
                out.println("Server:" +inputLine); //Writing on to socket for cient to read
                out.flush();
            }
		
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}