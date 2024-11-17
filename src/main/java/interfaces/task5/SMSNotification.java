package interfaces.task5;

public class SMSNotification implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMSNotification message: " + message);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
