package org.jbt.example;

import jbt.execution.core.*;
import jbt.model.core.ModelTask;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExampleTree exampleTree = new ExampleTree();
        ModelTask  modelTask = exampleTree.getBT("jbt_example");
        List<IBTLibrary> ibtLibraryList = new ArrayList<>();
        ibtLibraryList.add(exampleTree);
        IContext context = ContextFactory.createContext(ibtLibraryList);
        IBTExecutor executor = BTExecutorFactory.createBTExecutor(modelTask, context);
        while (executor.getStatus() != ExecutionTask.Status.SUCCESS) {
            executor.tick();
        }
    }
}