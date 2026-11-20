package decorator.NotificationExample.v3;

public abstract class NotifierDecorator implements Notifier {
    protected final Notifier inner;

    protected NotifierDecorator(Notifier inner) {
        this.inner = inner;
    }

    @Override
    public void send(String message) {
        inner.send(message);
    }
}
