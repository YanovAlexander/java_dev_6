package got.java.dev6.module13.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        try(Socket socket = new Socket("localhost", 4000)) {
            System.out.println("Connected to " + socket.getRemoteSocketAddress());

            Scanner scanner = new Scanner(System.in);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            while (scanner.hasNext()) {
                String message = scanner.nextLine();
                if (message.equals("bye")) {
                    break;
                }
                dataOutputStream.writeUTF(message);
                dataOutputStream.flush();
            }


            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            System.out.println("Get from server " + dataInputStream.readUTF());

            System.out.println("Closing connection");
        }
    }
}
