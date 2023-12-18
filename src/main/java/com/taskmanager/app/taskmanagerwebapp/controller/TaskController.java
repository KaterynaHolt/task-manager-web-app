package com.taskmanager.app.taskmanagerwebapp.controller;
import com.taskmanager.app.taskmanagerwebapp.model.Task;
import com.taskmanager.app.taskmanagerwebapp.model.Tasks;
import com.taskmanager.app.taskmanagerwebapp.repository.TaskRepository;
import com.taskmanager.app.taskmanagerwebapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/taskmanager/")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskRepository taskRepository;

    //get all employees
    @GetMapping("/tasks")
    public Tasks getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping("/tasks")
    public Task createNewTask(@RequestBody Task task){
        return taskRepository.save(task);
    }
}
