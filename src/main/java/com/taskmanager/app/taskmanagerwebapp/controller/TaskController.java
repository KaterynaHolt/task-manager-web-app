package com.taskmanager.app.taskmanagerwebapp.controller;

import com.taskmanager.app.taskmanagerwebapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/taskmanager/")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    //get all employees
    @GetMapping("/tasks")
    public List<Object> getAllTasks(){
        List<Object> result = new ArrayList<>();
        result.add(taskRepository.getIncompletedTasks());
        result.add(taskRepository.getCompletedTasks());
        return result;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }
}
