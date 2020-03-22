package behavioral.chain_of_responsibilites;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class LogRequestHandler extends BaseRequestHandler {
    @Override
    public boolean canHandle() {
        return true;
    }

    @Override
    public void handle() {
        System.out.println(this.toString());
    }
}
