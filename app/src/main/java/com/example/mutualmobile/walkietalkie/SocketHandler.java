package com.example.mutualmobile.walkietalkie;

import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;

public class SocketHandler {
    private static SocketChannel socket;

    public static synchronized SocketChannel getSocket(){
        return socket;
    }

    public static synchronized void setSocket(SocketChannel socket){
        SocketHandler.socket = socket;
    }
}
