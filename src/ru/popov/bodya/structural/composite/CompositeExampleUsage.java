package ru.popov.bodya.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Composite позволяет сгруппировать множество объектов в древовидную структуру, а затем работать с ней так,
 * как будто это единичный объект.
 */
public class CompositeExampleUsage {

    public static void main(String[] args) {
        List<Product> innerProducts = new ArrayList<>(Arrays.asList(
                new Gadget(10),
                new Book(5),
                new Box(Collections.singletonList(new Gadget(15)))
        ));
        Box box = new Box(innerProducts);
        System.out.println(box.calculateProductPrice());
    }
}
