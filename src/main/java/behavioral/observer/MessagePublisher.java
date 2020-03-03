package behavioral.observer;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class MessagePublisher implements Subject {
    private Logger logger = Logger.getGlobal();
    private Set<Observer> observers = new HashSet<>();

    public void attach(Observer observer) {
        if (observer != null && observers != null) {
            logger.info("++ attaching new observer with id : " + observer.getId());
            observers.add(observer);
        }
    }

    public void detach(Observer observer) {
        if (observer != null && observers != null) {
            logger.info("-- detaching observer with id : " + observer.getId());
            observers.remove(observer);
        }

    }

    public void publish(Message message) {
        if (observers == null || observers.isEmpty())
            return;
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
