package behavioral.mediator.client;


import behavioral.mediator.mediator.Server;
import behavioral.mediator.user.Group;
import behavioral.mediator.user.User;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();
        User mahdi = new User(server,"mehdi");
        User parham = new User(server,"parham");
        User ali = new User(server,"ali");
        Group gorg = new Group(server,"gorg");
        gorg.register(mahdi);
        gorg.register(parham);

        mahdi.SendMessage(gorg.getUsername(),"hello");






    }
}
