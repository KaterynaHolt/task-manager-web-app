package com.taskmanager.app.taskmanagerwebapp.controller;
import com.taskmanager.app.taskmanagerwebapp.model.Task;
import com.taskmanager.app.taskmanagerwebapp.service.TaskService;
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
    private TaskService taskService;

    //get all employees
    @GetMapping("/tasks")
    public List<List<Task>> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }
}
