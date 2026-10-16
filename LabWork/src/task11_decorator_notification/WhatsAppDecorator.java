package task11_decorator_notification;

public class WhatsAppDecorator extends NotifierDecorator {
    public WhatsAppDecorator(Notifier wrapped) {
        super(wrapped);
    }


    public String send(String msg) {
        return wrapped.send(msg) + " WA: " + msg;
    }
}