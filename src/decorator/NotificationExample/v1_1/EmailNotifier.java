package decorator.NotificationExample.v1_1;

public class EmailNotifier implements Notifier {
    @Override
    public boolean send(String message) {   // CHANGED: now returns success/failure
        System.out.println("Email sent: " + message);
        return true;
    }
}
