package cio.primer.networking.awt.chatting;

/* AWT Chatting client */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

// class for Messages Thread
class PayLoadThread extends Thread
{
	TextArea chatMsg;
	BufferedReader br;

	PayLoadThread(TextArea cMsg, BufferedReader lbr)
	{
		chatMsg = cMsg;
		br = lbr;
	}

	public void run()
	{
		String line;
		try {
			while (true) {
				line = br.readLine();
				chatMsg.append(line + "\n");
			} // end of while
		} catch (Exception ex) {
		}
	}
}

public class Slip20Q2Client extends Frame implements ActionListener
{

	PrintWriter priw;
	BufferedReader br;
	TextArea chatMsg;
	TextField tf;
	Button Send, Exit;
	Socket clientSocket;
	Panel p;

	public Slip20Q2Client(String hostname, int port) throws Exception
	{

		clientSocket = new Socket(hostname, port);
		br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		priw = new PrintWriter(clientSocket.getOutputStream(), true);

		// GUI creation code

		p = new Panel();
		Send = new Button("Send");
		Exit = new Button("Exit");

		chatMsg = new TextArea();
		chatMsg.setRows(10);
		chatMsg.setColumns(50);
		chatMsg.setEditable(false);
		tf = new TextField(50);

		Send.addActionListener(this);
		Exit.addActionListener(this);

		p.add(chatMsg);
		p.add(tf);
		p.add(Send);
		p.add(Exit);
		add(p);

		setSize(500, 300);
		setVisible(true);
		MessagesThread myThread = new MessagesThread(chatMsg, br);
		myThread.start();

	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == Exit) {
			priw.println("end");
			System.exit(0);
		} else {
			// send message to server
			priw.println(tf.getText());
		}
	}

	public static void main(String argv[])
	{

		try {
			String servername = argv[0];
			int port = Integer.parseInt(argv[1]);
			new Slip20Q2Client(servername, port);
		} catch (Exception ex) {
			System.out.println("Error --> " + ex.getMessage());
		}

	} // end of main

}
