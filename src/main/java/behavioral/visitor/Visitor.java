package behavioral.visitor;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface Visitor {
    void visitPaymentRequest(PaymentRequest request);

    void visitPurchaseRequest(PurchaseRequest request);
}
