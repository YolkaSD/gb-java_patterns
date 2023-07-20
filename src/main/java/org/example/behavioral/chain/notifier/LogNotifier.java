package org.example.behavioral.chain.notifier;

public class LogNotifier extends Notifier{
    public LogNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("пишу логи: " + message);
    }
}
