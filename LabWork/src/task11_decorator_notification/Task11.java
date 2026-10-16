package task11_decorator_notification;

public class Task11 {
    public static void main(String[] args) {
        Notifier n = new EmailNotifier();
        n = new SMSDecorator(n);
        n = new SlackDecorator(n);
        n = new WhatsAppDecorator(n);

        System.out.println(n.send("Server down"));

        // in this task i found multi-channel notifications: email, SMS, Slack, and WhatsApp
    }
}