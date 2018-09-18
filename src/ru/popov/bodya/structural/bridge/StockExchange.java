package ru.popov.bodya.structural.bridge;

public class StockExchange extends Program {

    StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development in progress");
        mDeveloper.writeCode();
    }
}
