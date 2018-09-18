package ru.popov.bodya.structural.composite;

public class Gadget implements Product {

    private final int price;

    public Gadget(int price) {
        this.price = price;
    }

    @Override
    public int calculateProductPrice() {
        return price;
    }
}
