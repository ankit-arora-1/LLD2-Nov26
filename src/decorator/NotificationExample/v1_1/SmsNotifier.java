package decorator.NotificationExample.v1_1;

public class SmsNotifier implements Notifier {
    @Override
    public boolean send(String message) {
        System.out.println("SMS failed (gateway down): " + message);
        return false;
    }
}
