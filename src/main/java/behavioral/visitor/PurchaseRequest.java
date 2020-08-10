package behavioral.visitor;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class PurchaseRequest implements Request {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPurchaseRequest(this);
    }
}
