package decorator.NotificationExample.v1_2;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Notifier> notifiers = List.of(
                new EmailNotifier(),
                new RetryNotifier(3),
                new LoggingNotifier(),

                new SmsNotifier(),
                new RetryNotifier(3),
                new LoggingNotifier()
        );

        String message = "Your OTP is 1234";


        Notifier lastChannel = null;
        boolean lastSendSucceeded = true;
        for (Notifier notifier : notifiers) {
            if (notifier instanceof LoggingNotifier) {
                LoggingNotifier logger = (LoggingNotifier) notifier;
                logger.setLastSendSucceeded(lastSendSucceeded);
                logger.send(message);
            } else if (notifier instanceof RetryNotifier) {
                RetryNotifier retry = (RetryNotifier) notifier;
                lastSendSucceeded = retry.retry(lastChannel, message, lastSendSucceeded);
            } else {
                lastChannel = notifier;
                lastSendSucceeded = notifier.send(message);
            }
        }

    }
}
