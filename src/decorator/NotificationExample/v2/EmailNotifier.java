package decorator.NotificationExample.v2;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
