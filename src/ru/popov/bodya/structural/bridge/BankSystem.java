package ru.popov.bodya.structural.bridge;

public class BankSystem extends Program {

    BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress");
        mDeveloper.writeCode();
    }
}
