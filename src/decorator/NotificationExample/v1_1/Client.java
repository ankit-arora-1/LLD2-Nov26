package decorator.NotificationExample.v1_1;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Notifier> notifiers = List.of(
                new EmailNotifier(),
                new LoggingNotifier(),

                new SmsNotifier(),
                new LoggingNotifier()
        );

        String message = "Your OTP is 1234";

        boolean lastSendSucceeded = true;
        for (Notifier notifier : notifiers) {
            if (notifier instanceof LoggingNotifier) {
                LoggingNotifier logger = (LoggingNotifier) notifier;
                logger.setLastSendSucceeded(lastSendSucceeded);
                logger.send(message);
            } else {
                lastSendSucceeded = notifier.send(message);
            }
        }

        // What if we want to again update the code and add a retrying logic now? -> See v1_2

    }
}
