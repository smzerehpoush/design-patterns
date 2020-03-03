package behavioral.observer;

import java.util.logging.Logger;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Subscriber implements Observer {
    private Logger logger = Logger.getGlobal();
    private Long id;

    public Subscriber(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void update(Message message) {
        logger.info("## updating message on subscriber " + getId() + " : " +
                (message == null ? null : message.getMessageContent()));
    }
}
