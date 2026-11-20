package decorator.NotificationExample.v2_1;

public class Client {
    public static void main(String[] args) {
        Notifier email = new LoggingNotifier(new EmailNotifier());
        Notifier sms = new LoggingNotifier(new SmsNotifier());

        String message = "Your OTP is 1234";
        send(email, message);
        System.out.println();
        send(sms, message);

        // What if I want to add Retry logic? -> See v2_2

    }

    private static void send(Notifier notifier, String message) {
        try {
            notifier.send(message);
        } catch (RuntimeException e) {
            System.out.println("Client: notification failed, moving on");
        }
    }
}
