package com.taskmanager.app.taskmanagerwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.taskmanager.app.taskmanagerwebapp.*")
public class TaskManagerWebAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskManagerWebAppApplication.class, args);
    }

}
