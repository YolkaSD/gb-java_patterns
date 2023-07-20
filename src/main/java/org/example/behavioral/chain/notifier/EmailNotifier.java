package org.example.behavioral.chain.notifier;

public class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("отправляю email: " + message);
    }
}
