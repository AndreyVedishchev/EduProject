package interfaces.task5;

public class NotificationFactory {

    public static NotificationSender getNotification(NotificationType type) {
        return switch (type) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SMSNotification();
            case PUSH -> new PushNotification();
        };
    }

    public static void main(String[] args) {

        NotificationSender eSender = NotificationFactory.getNotification(NotificationType.EMAIL);
        eSender.sendNotification("msg1");

        NotificationSender sSender = NotificationFactory.getNotification(NotificationType.SMS);
        sSender.sendNotification("msg2");

    }
}
