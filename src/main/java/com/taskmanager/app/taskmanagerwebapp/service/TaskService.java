package com.taskmanager.app.taskmanagerwebapp.service;

import com.taskmanager.app.taskmanagerwebapp.model.Task;
import com.taskmanager.app.taskmanagerwebapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    /**
     * This method separates data into two tables
     */
    public List<List<Task>> separateData(){
        List<List<Task>> result = new ArrayList<>();
        result.add(taskRepository.getIncompletedTasks());
        result.add(taskRepository.getCompletedTasks());
        return result;
    }
}
