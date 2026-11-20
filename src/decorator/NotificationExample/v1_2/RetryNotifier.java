package decorator.NotificationExample.v1_2;

public class RetryNotifier implements Notifier {
    private final int maxAttempts;

    public RetryNotifier(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public boolean retry(Notifier channel, String message, boolean lastSendSucceeded) {
        int attempt = 1;
        while (!lastSendSucceeded && attempt < maxAttempts) {
            attempt++;
            System.out.println("[RETRY] Trying again (attempt " + attempt + " of " + maxAttempts + ")");
            lastSendSucceeded = channel.send(message);
        }
        return lastSendSucceeded;
    }

    @Override
    public boolean send(String message) {
        return true;
    }
}
