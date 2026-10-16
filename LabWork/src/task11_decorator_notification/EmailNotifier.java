package task11_decorator_notification;

public class EmailNotifier implements Notifier {

    public String send(String msg) {
        return "Emaill: " + msg;
    }
}