package behavioral.observer;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface Observer {
    Long getId();

    void update(Message message);
}
