package pl.lniedz.observer;

public class NotificationManager implements PaymentListener {

    @Override
    public void paymentDone() {
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("Notification sent.");
    }
}
