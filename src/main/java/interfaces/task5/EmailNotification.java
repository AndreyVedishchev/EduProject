package interfaces.task5;

public class EmailNotification implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("EmailNotification message: " + message);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
