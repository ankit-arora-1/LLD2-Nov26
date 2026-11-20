package decorator.NotificationExample.v2;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
