package pl.lniedz.observer;

public class PaymentEventLogger implements PaymentListener {

    @Override
    public void paymentDone() {
        log();
    }

    private void log() {
        System.out.println("Payment received.");
    }
}
