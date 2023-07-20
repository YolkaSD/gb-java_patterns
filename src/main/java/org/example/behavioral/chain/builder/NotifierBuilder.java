package org.example.behavioral.chain.builder;

import org.example.behavioral.chain.notifier.*;

public class NotifierBuilder {
    private Notifier notifier;

    private void createNotifier() {
        notifier = new LogNotifier(Priority.ROUTINE);
        Notifier notifier1 = new EmailNotifier(Priority.WARNING);
        Notifier notifier2 = new SMSNotifier(Priority.ASAP);

        notifier.setNextNotifier(notifier1);
        notifier1.setNextNotifier(notifier2);
    }

    public Notifier build() {
        createNotifier();

        return notifier;
    }
}
