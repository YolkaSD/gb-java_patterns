package org.example.creational.builder;

import java.util.Arrays;

public class BusinessCard {
    private String name;
    private int price;
    private int[] size;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + Arrays.toString(size) +
                '}';
    }
}
