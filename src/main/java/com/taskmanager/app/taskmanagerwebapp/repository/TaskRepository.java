package com.taskmanager.app.taskmanagerwebapp.repository;

import com.taskmanager.app.taskmanagerwebapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
    @Query(value = "SELECT t.id, t.text, t.date, t.status, t.priority, t.tag FROM tasks t WHERE t.status = 'Completed'",
            nativeQuery = true)
    public List<Task> getCompletedTasks();

    @Query(value = "SELECT t.id, t.text, t.date, t.status, t.priority, t.tag FROM tasks t WHERE NOT t.status = 'Completed'",
            nativeQuery = true)
    public List<Task> getIncompletedTasks();
}
