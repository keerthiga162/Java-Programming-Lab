
import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server waiting...");

        Socket s = ss.accept();
        DataInputStream dis =
            new DataInputStream(s.getInputStream());

        String msg = dis.readUTF();
        System.out.println("Client: " + msg);

        dis.close();
        s.close();
        ss.close();
    }
}
