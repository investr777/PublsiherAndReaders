package config;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientHandler implements Runnable {
    BufferedReader reader;
    Socket socket;

    public ClientHandler(Socket clientSocket) {
        try {
            socket = clientSocket;
            InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(isReader);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void run() {
        String message;
        try {
            while ((message = reader.readLine()) != null) {
                ConfigNetwork.tellEveryone(message);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
