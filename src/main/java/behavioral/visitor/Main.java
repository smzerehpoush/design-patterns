package behavioral.visitor;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        final Set<Request> requests = new HashSet<>();
        requests.add(new PaymentRequest());
        requests.add(new PurchaseRequest());

        Visitor visitor = new SimpleVisitor();

        requests.forEach(i -> i.accept(visitor));
    }
}
