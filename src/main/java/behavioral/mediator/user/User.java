package behavioral.mediator.user;


import behavioral.mediator.mediator.Server;

public class User implements Client {
    private final String username;
    private final Server server;

    public User(Server server, String username) {
        this.username = username;
        this.server = server;
        server.register(this);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void SendMessage(String to, String message) {
        server.broadcast(username,to, message);
    }

    @Override
    public void receiveMessage(String from, String message) {
        System.out.println("___________________________");
        System.out.println(" (^_^)  "+ from);
        System.out.println("---------------------------");
        System.out.println(message);
    }
}
