package pl.lniedz.observer;

public class PaymentManager {

    private final NotificationManager notificationManager = new NotificationManager();
    private final PaymentEventLogger paymentEventLogger = new PaymentEventLogger();

    public void pay() {
        notificationManager.sendNotification();
        paymentEventLogger.log();
    }
}
