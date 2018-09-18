package ru.popov.bodya.structural.composite;

public class Book implements Product {

    private final int mPrice;

    public Book(int price) {
        this.mPrice = price;
    }

    @Override
    public int calculateProductPrice() {
        return mPrice;
    }
}
