package com.taskmanager.app.taskmanagerwebapp.model;

import java.util.List;

public class Data {
    private List<Task> completed;
    private List<Task> incompleted;

    public Data() {
    }

    public List<Task> getCompleted() {
        return completed;
    }

    public void setCompleted(List<Task> completed) {
        this.completed = completed;
    }

    public List<Task> getIncompleted() {
        return incompleted;
    }

    public void setIncompleted(List<Task> incompleted) {
        this.incompleted = incompleted;
    }
}
