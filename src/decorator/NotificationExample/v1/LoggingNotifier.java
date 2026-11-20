package decorator.NotificationExample.v1;

public class LoggingNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[LOG] " + message);
    }
}
