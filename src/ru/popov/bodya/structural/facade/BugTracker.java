package ru.popov.bodya.structural.facade;

public class BugTracker {

    private boolean mIsActiveSprint;

    boolean isActiveSprint() {
        return mIsActiveSprint;
    }

    void startSprint() {
        System.out.println("Sprint is active");
        mIsActiveSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is not active");
        mIsActiveSprint = false;
    }
}
