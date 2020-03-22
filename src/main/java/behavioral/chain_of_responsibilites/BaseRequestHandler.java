package behavioral.chain_of_responsibilites;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public abstract class BaseRequestHandler implements RequestHandler {
    private RequestHandler next;

    public BaseRequestHandler() {
    }

    public BaseRequestHandler(RequestHandler handler) {
        this.next = handler;
    }

    @Override
    public void process(RequestHandler nextHandler) {
        if (canHandle()) {
            handle();
            if (next != null)
                next.process(nextHandler);
        } else {
            System.out.println("request can not be handled");

        }
    }
}
