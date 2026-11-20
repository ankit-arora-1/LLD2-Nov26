package decorator.NotificationExample.v2_2;

// The common interface. Real channels AND decorators will all implement this,
// so any caller just sees a Notifier and doesn't care what is inside it.
public interface Notifier {
    void send(String message);
}
