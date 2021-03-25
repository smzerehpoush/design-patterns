package behavioral.mediator.user;

public interface Client {
    String getUsername();

    void SendMessage(String to,String message);

    void receiveMessage(String from, String message);
}
