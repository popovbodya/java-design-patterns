package ru.popov.bodya.structural.facade;

/**
 * Facade предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку.
 */
public class FacadeUsageExample {

    public static void main(String[] args) {
        WorkflowFacade workflowFacade = new WorkflowFacade();
        workflowFacade.solveProblems();
    }
}
