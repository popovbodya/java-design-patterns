package ru.popov.bodya.structural.bridge;

/**
 * Bridge разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию,
 * позволяя изменять их независимо друг от друга.
 */
public class BridgeUsageExample {

    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };
        for (Program program : programs) {
            program.developProgram();
        }
    }

}
