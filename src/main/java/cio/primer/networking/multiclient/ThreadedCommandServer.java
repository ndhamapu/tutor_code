package cio.primer.networking.multiclient;

import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedCommandServer
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Starting server....");
		int port = Integer.parseInt(args[0]);

		ServerSocket ss = new ServerSocket(port);

		while (true) {
			System.out.println("Waiting for connection from client...");
			Socket socket = ss.accept();
			ServerThread st = new ServerThread(socket);
			st.start();

		}
	}

}