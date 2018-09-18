package ru.popov.bodya.structural.bridge;

public abstract class Program {

    final Developer mDeveloper;

    Program(Developer developer) {
        mDeveloper = developer;
    }

    public abstract void developProgram();
}
