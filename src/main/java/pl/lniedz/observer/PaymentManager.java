package pl.lniedz.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    private final List<PaymentListener> paymentListeners = new ArrayList<>();

    public void pay() {
        var paymentEvent = new PaymentEvent();
        paymentListeners.forEach(
                p -> p.paymentDone(paymentEvent)
        );
    }

    public void registerPaymentListener(PaymentListener p) {
        paymentListeners.add(p);
    }

    public void unregisterPaymentListener(PaymentListener p) {
        paymentListeners.remove(p);
    }
}
