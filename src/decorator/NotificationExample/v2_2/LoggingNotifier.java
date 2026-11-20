package decorator.NotificationExample.v2_2;


public class LoggingNotifier implements Notifier {
    private final Notifier inner;

    public LoggingNotifier(Notifier inner) {
        this.inner = inner;
    }

    @Override
    public void send(String message) {
        System.out.println("[LOG] Sending: " + message);
        try {
            inner.send(message);
            System.out.println("[LOG] Delivered: " + message);
        } catch (RuntimeException e) {
            System.out.println("[LOG] FAILED to deliver: " + message + " (" + e.getMessage() + ")");
            throw e;
        }
    }
}
