package decorator.NotificationExample.v2_1;

// Concrete component: does the real work of sending an email.
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
