package got.java.dev6.module13.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.execute(() -> {
            System.out.println("Server started, waiting for the client");
            try(ServerSocket serverSocket = new ServerSocket(4000)) {
                Socket socket = serverSocket.accept();
                System.out.println("Server accepted request");

                while (true) {
                    DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                    System.out.println("Message from client: " + inputStream.readUTF());
                    DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                    dataOutputStream.writeUTF("Thanks, have a good day. Bye");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
