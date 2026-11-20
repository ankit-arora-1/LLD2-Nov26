package decorator.NotificationExample.v1;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
