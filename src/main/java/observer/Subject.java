package observer;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void publish(Message message);
}
