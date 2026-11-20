package decorator.NotificationExample.v2_2;

public class RetryNotifier implements Notifier {
    private final Notifier inner;
    private final int maxAttempts;

    public RetryNotifier(Notifier inner, int maxAttempts) {
        this.inner = inner;
        this.maxAttempts = maxAttempts;
    }

    @Override
    public void send(String message) {
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                inner.send(message);
                return;
            } catch (RuntimeException e) {
                if (attempt == maxAttempts) {
                    throw e;
                }
                System.out.println("[RETRY] Attempt " + attempt + " failed, trying again");
            }
        }
    }
}
