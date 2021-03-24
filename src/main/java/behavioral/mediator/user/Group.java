package behavioral.mediator.user;


import behavioral.mediator.mediator.Server;

import java.util.HashMap;
import java.util.InputMismatchException;

public class Group implements Client {
    private final String username;
    private final Server server;
    HashMap<String, Client> member = new HashMap<>();

    public Group(Server server, String username) {
        this.username = username;
        this.server=server;
        server.register(this);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void SendMessage(String to, String message) {
        server.broadcast(username,to,message);
    }

    public void register(Client Client) {
        if (Client instanceof User) {
            member.put(Client.getUsername(), Client);
        }else {
            throw new InputMismatchException("امکان درج گروه در گروه دیگر وجود ندارد.");
        }
    }

    @Override
    public void receiveMessage(String from,String message) {
        for (Client value : member.values()) {
            System.out.print(from +" in group  ");
            SendMessage(value.getUsername(),message);
        }
    }

}
