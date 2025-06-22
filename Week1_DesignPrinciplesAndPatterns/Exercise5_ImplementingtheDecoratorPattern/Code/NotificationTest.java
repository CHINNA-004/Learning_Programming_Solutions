package Exercise5_ImplementingtheDecoratorPattern.Code;

public class NotificationTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier emailAndSMS = new SMSNotifierDecorator(emailNotifier);

        Notifier fullNotifier = new SlackNotifierDecorator(emailAndSMS);

        fullNotifier.send("System update scheduled at 8 PM tonight.");
    }
}
