package org.example.week10;


public class ChatApplication {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.start(83);
    }
}
