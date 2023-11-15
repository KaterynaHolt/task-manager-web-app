package com.taskmanager.app.taskmanagerwebapp.repository;

import com.taskmanager.app.taskmanagerwebapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {

}
