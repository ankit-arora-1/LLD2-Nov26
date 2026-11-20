package decorator.NotificationExample.v2;

public class Client {
    public static void main(String[] args) {
        // What if we want to add logging now? -> see v2_1
        Notifier email = new EmailNotifier();
        Notifier sms = new SmsNotifier();

        String message = "Your OTP is 1234";
        email.send(message);
        sms.send(message);
    }
}
