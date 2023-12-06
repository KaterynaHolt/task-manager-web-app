package com.taskmanager.app.taskmanagerwebapp.controller;

import com.taskmanager.app.taskmanagerwebapp.model.Task;
import com.taskmanager.app.taskmanagerwebapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/taskmanager/")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    //get all employees
    @GetMapping("/tasks")
    public List<List<Task>> getAllTasks(){
        List<List<Task>> result = new ArrayList<>();
        result.add(taskRepository.getIncompletedTasks());
        result.add(taskRepository.getCompletedTasks());
        //return taskRepository.getIncompletedTasks();
        return result;
    }

    /*@GetMapping("/tasks")
    public List<Task> getCompletedTasks(){
        //List<List<Task>> result = new ArrayList<>();
        //result.add(taskRepository.getIncompletedTasks());
        //result.add(taskRepository.getCompletedTasks());
        return taskRepository.getCompletedTasks();
    }*/

    @GetMapping("/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }
}
