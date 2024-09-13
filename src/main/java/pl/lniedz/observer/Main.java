package pl.lniedz.observer;

public class Main {

    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();

        var notificationManager = new NotificationManager();
        var paymentEventLogger = new PaymentEventLogger();
        paymentManager.registerPaymentListener(notificationManager);
        paymentManager.registerPaymentListener(paymentEventLogger);

        paymentManager.pay();

        paymentManager.unregisterPaymentListener(paymentEventLogger);

        paymentManager.pay();
    }
}
