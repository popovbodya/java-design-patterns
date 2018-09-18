package ru.popov.bodya.structural.composite;

import java.util.List;

public class Box implements Product {

    private final List<Product> innerProductList;

    public Box(List<Product> innerProductList) {
        this.innerProductList = innerProductList;
    }

    @Override
    public int calculateProductPrice() {
        int sum = 0;
        for (Product product : innerProductList) {
            sum += product.calculateProductPrice();
        }
        return sum;
    }
}
