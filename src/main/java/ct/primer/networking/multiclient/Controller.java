package ct.primer.networking.multiclient;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


public class Controller {

private ClientFrame cf;
private String message;
private Socket socket;
private String response;

public Controller(ClientFrame cf) {
    this.cf = cf;
}


public void sendChat(String s) {
    message = s;
    System.out.println("FROM CONTROLLER: received: " + message);
    try {
    InetAddress i = InetAddress.getByName("localhost");
    socket= new Socket(i, 8989);
    OutputStream os = socket.getOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(os);
    System.out.println("FROM CONTROLLER: sending message to the server...");
    oos.writeObject(message);
    InputStream is = socket.getInputStream();
    ObjectInputStream ois = new ObjectInputStream(is);
    System.out.println("getting string back from server....");
    response = (String) ois.readObject();
    cf.updateGUI(response);
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}

}