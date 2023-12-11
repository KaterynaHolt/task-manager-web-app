package com.taskmanager.app.taskmanagerwebapp.service;

import com.taskmanager.app.taskmanagerwebapp.model.Data;
import com.taskmanager.app.taskmanagerwebapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    /**
     * This method separates data into two tables
     */
    public Data getAllTasks(){
        Data data = new Data();
        data.setIncompleted(taskRepository.getIncompletedTasks());
        data.setCompleted(taskRepository.getCompletedTasks());
        return data;
    }
}
