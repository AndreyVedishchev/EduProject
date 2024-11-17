package interfaces.task5;

public class PushNotification implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("PushNotification message: " + message);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
