package pl.lniedz.observer;

@FunctionalInterface
public interface PaymentListener {

    void paymentDone();
}
