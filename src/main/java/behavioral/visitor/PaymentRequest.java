package behavioral.visitor;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class PaymentRequest implements Request {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPaymentRequest(this);
    }
}
