package pl.lniedz.observer;

public class NotificationManager implements PaymentListener {

    @Override
    public void paymentDone(PaymentEvent e) {
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("Notification sent.");
    }
}
