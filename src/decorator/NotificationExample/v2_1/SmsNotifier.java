package decorator.NotificationExample.v2_1;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String message) {
        throw new RuntimeException("SMS gateway down");
    }
}
