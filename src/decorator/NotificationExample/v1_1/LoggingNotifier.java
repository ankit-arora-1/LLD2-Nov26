package decorator.NotificationExample.v1_1;

public class LoggingNotifier implements Notifier {
    private boolean lastSendSucceeded;

    public void setLastSendSucceeded(boolean lastSendSucceeded) {
        this.lastSendSucceeded = lastSendSucceeded;
    }

    @Override
    public boolean send(String message) {   // CHANGED: now checks the result
        if (lastSendSucceeded) {
            System.out.println("[LOG] Delivered: " + message);
        } else {
            System.out.println("[LOG] FAILED to deliver: " + message);
        }

        return true;
    }
}
