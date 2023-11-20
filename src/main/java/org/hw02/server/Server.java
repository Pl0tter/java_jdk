package org.hw02.server;

import org.hw02.client.Client;
import org.hw02.repo.FileRepo;
import org.hw02.repo.IRepo;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private ServerView serverView;
    private List<Client> clientList;
    private IRepo repo;
    private boolean work;

    public Server(ServerView serverView) {
        this.serverView = serverView;
        clientList = new ArrayList<>();
        repo = new FileRepo();
    }

    public boolean connectUser(Client client) {
        if (!work) {
            return false;
        }
        clientList.add(client);
        return true;
    }

    public String getHistory() {
        return repo.readLog();
    }

    public void disconnectUser(Client client) {
        clientList.remove(client);
        if (client != null) {
            client.disconnect();
        }
    }

    public void sendMessage(String text) {
        if (!work) {
            return;
        }
        serverView.appendLog(text);
        answerAll(text);
        repo.saveInLog(text);
    }

    private void answerAll(String text) {
        for (Client client : clientList) {
            client.serverAnswer(text);
        }
    }

    public void start() {
        work = true;
    }

    public void stop() {
        work = false;
        while (!clientList.isEmpty()) {
            disconnectUser(clientList.get(clientList.size() - 1));
        }
    }

    public boolean isWork() {
        return work;
    }
}
