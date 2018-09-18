package ru.popov.bodya.structural.adapter;

/**
 * Адаптер позволяет объектам с несовместимыми интерфейсами работать вместе
 */
public class AdapterUsageExample {

    public static void main(String[] args) {
        Database database = new DatabaseAdapter(new DatabaseLogger());
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
