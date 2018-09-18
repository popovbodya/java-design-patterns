package ru.popov.bodya.structural.facade;

class Developer {

    void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading habr...");
        }
    }
}
