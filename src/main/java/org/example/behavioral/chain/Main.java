package org.example.behavioral.chain;

import org.example.behavioral.chain.builder.NotifierBuilder;
import org.example.behavioral.chain.notifier.*;

public class Main {
    public static void main(String[] args) {
        NotifierBuilder builder = new NotifierBuilder();
        Notifier notifier = builder.build();

        notifier.manageMessage(Priority.ROUTINE, "Все хорошо");
        notifier.manageMessage(Priority.WARNING, "Что-то пошло не так");
        notifier.manageMessage(Priority.ASAP, "Все плохо");
    }
}
