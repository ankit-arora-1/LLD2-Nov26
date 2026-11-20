package decorator.NotificationExample.v3;

public class RetryNotifier extends NotifierDecorator {
    private final int maxAttempts;

    public RetryNotifier(Notifier inner, int maxAttempts) {
        super(inner);
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
