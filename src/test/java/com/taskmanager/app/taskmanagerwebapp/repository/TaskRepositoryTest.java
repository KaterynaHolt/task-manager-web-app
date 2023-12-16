package com.taskmanager.app.taskmanagerwebapp.repository;

import com.taskmanager.app.taskmanagerwebapp.model.Task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TaskRepositoryTest {
    @Autowired
    private TaskRepository taskRepository;

    /**
     * Test of getting incompleted Tasks - getIncompletedTasks
     */
    @Test
    public void test_getting_incompleted_tasks(){
        //WHEN
        List<Task> incompletedTasks = taskRepository.getIncompletedTasks();
        //THEN
        assertThat(incompletedTasks).isNotEmpty();
        assertThat(incompletedTasks).extracting(Task::getStatus).doesNotContain("Completed");
    }

    /**
     * Test of getting completed Tasks - getCompletedTasks
     */
    @Test
    public void test_getting_completed_tasks(){
        //WHEN
        List<Task> completedTasks = taskRepository.getCompletedTasks();
        //THEN
        assertThat(completedTasks).isNotEmpty();
        assertThat(completedTasks).extracting(Task::getStatus).contains("Completed");
        assertThat(completedTasks).extracting(Task::getStatus).doesNotContain("Incompleted");
        assertThat(completedTasks).extracting(Task::getStatus).doesNotContain("Pending");
        assertThat(completedTasks).extracting(Task::getStatus).doesNotContain("In progress");
    }
}
