package org.example.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage: java ChatClient <username> <server-ip>");
            System.exit(1);
        }


        String username = args[0];
        String serverIP = args[1];
        int serverPort = 83;

        try {

            Socket socket = new Socket(serverIP, serverPort);


            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            PrintWriter serverWriter = new PrintWriter(socket.getOutputStream(), true);


            serverWriter.println(username);


            new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = serverReader.readLine()) != null) {

                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();


            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage;
            while ((clientMessage = consoleReader.readLine()) != null) {

                serverWriter.println(clientMessage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
