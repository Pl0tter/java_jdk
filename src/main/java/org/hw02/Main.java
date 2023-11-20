package org.hw02;

import org.hw02.client.ClientGUI;
import org.hw02.server.ServerGUI;

public class Main {
    public static void main(String[] args) {
        ServerGUI serverGUI = new ServerGUI();
        new ClientGUI(serverGUI);
        new ClientGUI(serverGUI);
    }
}