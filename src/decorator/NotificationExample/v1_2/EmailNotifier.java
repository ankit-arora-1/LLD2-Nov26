package decorator.NotificationExample.v1_2;

public class EmailNotifier implements Notifier {
    @Override
    public boolean send(String message) {
        System.out.println("Email sent: " + message);
        return true;
    }
}
