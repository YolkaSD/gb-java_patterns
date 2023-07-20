package org.example.behavioral.chain.notifier;

public class SMSNotifier extends Notifier{
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("отправляю смс: " + message);
    }
}
