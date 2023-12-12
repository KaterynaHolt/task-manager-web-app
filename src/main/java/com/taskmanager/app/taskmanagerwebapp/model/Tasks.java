package com.taskmanager.app.taskmanagerwebapp.model;

import java.util.List;

public class Tasks {
    private List<Task> completedTasks;
    private List<Task> incompletedTasks;

    public Tasks() {
    }

    public List<Task> getCompleted() {
        return completedTasks;
    }

    public void setCompleted(List<Task> completedTasks) {
        this.completedTasks = completedTasks;
    }

    public List<Task> getIncompleted() {
        return incompletedTasks;
    }

    public void setIncompleted(List<Task> incompletedTasks) {
        this.incompletedTasks = incompletedTasks;
    }
}
