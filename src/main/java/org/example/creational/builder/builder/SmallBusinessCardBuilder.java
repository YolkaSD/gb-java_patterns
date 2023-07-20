package org.example.creational.builder.builder;

public class SmallBusinessCardBuilder extends BusinessCardBuilder{
    @Override
    public void createName() {
        getBusinessCard().setName("Маленькая визитка");
    }

    @Override
    public void createPrice() {
        getBusinessCard().setPrice(50);

    }

    @Override
    public void createSize() {
        getBusinessCard().setSize(new int[] {16, 9});
    }
}
