package behavioral.mediator.mediator;


import behavioral.mediator.user.Client;

import java.util.HashMap;

public class Server {
    HashMap<String, Client> users = new HashMap<>();

    public void register(Client client) {
        users.put(client.getUsername(), client);
    }

    public void broadcast(String from, String to,String message){
        Client client= users.get(to);
        if (client != null){
            client.receiveMessage(from , message);
        }
    }
}
