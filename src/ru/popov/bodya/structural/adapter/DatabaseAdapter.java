package ru.popov.bodya.structural.adapter;

public class DatabaseAdapter implements Database {

    private final DatabaseLogger mDatabaseLogger;

    public DatabaseAdapter(DatabaseLogger databaseLogger) {
        mDatabaseLogger = databaseLogger;
    }

    @Override
    public void insert() {
        mDatabaseLogger.saveObject();
    }

    @Override
    public void update() {
        mDatabaseLogger.updateObject();
    }

    @Override
    public void select() {
        mDatabaseLogger.loadObject();
    }

    @Override
    public void remove() {
        mDatabaseLogger.deleteObject();
    }
}
