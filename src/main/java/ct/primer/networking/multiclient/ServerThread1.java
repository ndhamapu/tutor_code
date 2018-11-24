package ct.primer.networking.multiclient;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServerThread1 extends Thread {

    private Socket socket = null;
    private String s;

    public ServerThread1(Socket s) {
        socket = s;

    }

    public void run() {
        try {
            InputStream is = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            s = (String) ois.readObject();
            System.out.println("received string: " + s);
            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(s);
            System.out.println("sent object back to client...");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}