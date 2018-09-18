package ru.popov.bodya.structural.facade;

class WorkflowFacade {

    private Developer mDeveloper;
    private Job mJob;
    private BugTracker mBugTracker;

    WorkflowFacade() {
        mDeveloper = new Developer();
        mJob = new Job();
        mBugTracker = new BugTracker();
    }

    void solveProblems() {
        mJob.startJob();
        mBugTracker.startSprint();
        mDeveloper.doJobBeforeDeadline(mBugTracker);
        mJob.finishJob();
        mBugTracker.finishSprint();
    }
}
