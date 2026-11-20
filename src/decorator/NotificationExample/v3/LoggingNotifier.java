package decorator.NotificationExample.v3;

public class LoggingNotifier extends NotifierDecorator {

    public LoggingNotifier(Notifier inner) {
        super(inner);
    }

    @Override
    public void send(String message) {
        System.out.println("[LOG] Sending: " + message);         // before
        try {
            inner.send(message);
            System.out.println("[LOG] Delivered: " + message);   // after: success
        } catch (RuntimeException e) {
            System.out.println("[LOG] FAILED to deliver: " + message + " (" + e.getMessage() + ")");
            throw e;   // don't hide the failure from whoever called us
        }
    }
}
