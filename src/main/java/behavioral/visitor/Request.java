package behavioral.visitor;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface Request {
    void accept(Visitor visitor);
}
