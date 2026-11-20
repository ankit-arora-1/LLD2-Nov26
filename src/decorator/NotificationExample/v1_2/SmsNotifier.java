package decorator.NotificationExample.v1_2;

public class SmsNotifier implements Notifier {
    private int attempts = 0;

    @Override
    public boolean send(String message) {
        attempts++;
        if (attempts < 3) {
            System.out.println("SMS failed (gateway down), attempt " + attempts + ": " + message);
            return false;
        }
        System.out.println("SMS sent, attempt " + attempts + ": " + message);
        return true;
    }
}
