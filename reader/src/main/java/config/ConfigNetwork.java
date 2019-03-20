package config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ConfigNetwork {
    public static BufferedReader reader;

    public static void setUpNetworking(String ip, int port) {
        try {
            Socket socket = new Socket(ip, port);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(streamReader);
            System.out.println("networking established");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
