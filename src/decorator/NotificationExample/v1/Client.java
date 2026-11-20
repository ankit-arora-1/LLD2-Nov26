package decorator.NotificationExample.v1;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        // How do we add Logging notifier here? -> See v1_1
        List<Notifier> notifiers = List.of(
                new LoggingNotifier(),
                new EmailNotifier(),
                new SmsNotifier()
        );

        for (Notifier notifier : notifiers) {
            notifier.send("Your OTP is 1234");
        }
    }
}
