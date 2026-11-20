package decorator.NotificationExample.v2_2;

public class SmsNotifier implements Notifier {

    private int attempts = 0;

    @Override
    public void send(String message) {
        attempts++;
        if (attempts < 3) {
            throw new RuntimeException("SMS gateway down");
        }
        System.out.println("SMS sent: " + message);
    }
}
