package task11_decorator_notification;

public class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier wrapped) {
        super(wrapped);
    }


    public String send(String msg) {
        return wrapped.send(msg) + " SMS: " + msg;
    }
}