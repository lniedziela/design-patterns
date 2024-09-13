package pl.lniedz.observer;

public class PaymentEventLogger implements PaymentListener {

    @Override
    public void paymentDone(PaymentEvent e) {
        log();
    }

    private void log() {
        System.out.println("Payment received.");
    }
}
