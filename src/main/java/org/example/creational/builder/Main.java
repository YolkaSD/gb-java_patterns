package org.example.creational.builder;

import org.example.creational.builder.builder.BusinessCardBuilder;
import org.example.creational.builder.builder.LargeBusinessBuilder;
import org.example.creational.builder.builder.SmallBusinessCardBuilder;

public class Main {
    public static void main(String[] args) {
        BusinessCardBuilder smallBusinessCardBuilder = new SmallBusinessCardBuilder();
        BusinessCard smallCard = smallBusinessCardBuilder.build();

        BusinessCardBuilder largeBusinessBuilder = new LargeBusinessBuilder();
        BusinessCard largeCard = largeBusinessBuilder.build();

        System.out.println(smallCard);
        System.out.println(largeCard);

        BusinessCard businessCard = new BusinessCard();

        System.out.println(businessCard);

    }
}
