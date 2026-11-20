package decorator.NotificationExample.v3;


public class Client {
    public static void main(String[] args) {

        Notifier email = new RetryNotifier(new LoggingNotifier(new EmailNotifier()), 3);
        Notifier sms = new RetryNotifier(new LoggingNotifier(new SmsNotifier()), 3);


        String message = "Your OTP is 1234";
        send(email, message);
        System.out.println();
        send(sms, message);

    }

    private static void send(Notifier notifier, String message) {
        try {
            notifier.send(message);
        } catch (RuntimeException e) {
            System.out.println("Client: notification failed, moving on");
        }
    }
}
