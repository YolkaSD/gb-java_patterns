package org.example.creational.builder.builder;

import org.example.creational.builder.BusinessCard;

public abstract class BusinessCardBuilder {
    private BusinessCard businessCard;

    abstract void createName();
    abstract void createPrice();
    abstract void createSize();

    public void createCard() {
        businessCard = new BusinessCard();
    }

    public BusinessCard getBusinessCard() {
        return businessCard;
    }

    public BusinessCard build() {
        createCard();
        createName();
        createPrice();
        createSize();

        return businessCard;
    }
}
