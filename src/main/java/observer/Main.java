package observer;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        MessagePublisher messagePublisher = new MessagePublisher();

        Subscriber subscriber1 = new Subscriber(1L);
        messagePublisher.attach(subscriber1);

        Subscriber subscriber2 = new Subscriber(2L);
        messagePublisher.attach(subscriber2);

        Message message = new Message("this is a message");
        messagePublisher.publish(message);

        messagePublisher.detach(subscriber1);

        Subscriber subscriber3 = new Subscriber(3L);
        messagePublisher.attach(subscriber3);

        Message anotherMessage = new Message("this is another message");
        messagePublisher.publish(anotherMessage);

        messagePublisher.detach(subscriber2);
        messagePublisher.detach(subscriber3);
    }
}
