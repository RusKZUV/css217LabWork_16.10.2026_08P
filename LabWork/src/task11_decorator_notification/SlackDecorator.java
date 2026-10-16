package task11_decorator_notification;

public class SlackDecorator extends NotifierDecorator {
    public SlackDecorator(Notifier wrapped) {
        super(wrapped);
    }


    public String send(String msg) {
        return wrapped.send(msg) + " SLACK: " + msg;
    }
}