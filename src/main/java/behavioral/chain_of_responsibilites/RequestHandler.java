package behavioral.chain_of_responsibilites;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface RequestHandler {
    void process(RequestHandler next);

    boolean canHandle();

    void handle();
}
