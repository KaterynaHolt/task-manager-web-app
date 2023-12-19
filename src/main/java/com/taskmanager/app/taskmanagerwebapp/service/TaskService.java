package com.taskmanager.app.taskmanagerwebapp.service;

import com.taskmanager.app.taskmanagerwebapp.model.Task;
import com.taskmanager.app.taskmanagerwebapp.model.Tasks;
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
    public Tasks getAllTasks(){
        Tasks data = new Tasks();
        data.setIncompleted(taskRepository.getIncompletedTasks());
        data.setCompleted(taskRepository.getCompletedTasks());
        return data;
    }

    /**
     * This method save new task to db
     */
    public Task createNewTask(Task task){
        return taskRepository.save(task);
    }
}
