package com.taskmanager.app.taskmanagerwebapp.controller;

import com.taskmanager.app.taskmanagerwebapp.model.Task;
import com.taskmanager.app.taskmanagerwebapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/taskmanager/")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    //get all employees
    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
}
