package org.example.creational.builder.builder;

public class LargeBusinessBuilder extends BusinessCardBuilder {
    @Override
    public void createName() {
        getBusinessCard().setName("Большая визитка");
    }

    @Override
    public void createPrice() {
        getBusinessCard().setPrice(100);
    }

    @Override
    public void createSize() {
        getBusinessCard().setSize(new int[]{32, 18});
    }
}
