package com.taskmanager.app.taskmanagerwebapp.service;
import com.taskmanager.app.taskmanagerwebapp.model.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.*;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TaskServiceTest {
    @Autowired
    TaskService taskService;

    /**
     * Test of getting all tasks separately - getAllTasks
     */
    @Test
    public void test_getting_all_tasks(){
        //WHEN
        List<List<Task>> result = taskService.getAllTasks();
        //THEN
        Assertions.assertTrue(result.size() == 2);

        assertThat(result.get(0)).extracting(Task::getStatus).doesNotContain("Completed");
        assertThat(result.get(1)).extracting(Task::getStatus).contains("Completed");
        assertThat(result.get(1)).extracting(Task::getStatus).doesNotContain("Incompleted");
        assertThat(result.get(1)).extracting(Task::getStatus).doesNotContain("Pending");
        assertThat(result.get(1)).extracting(Task::getStatus).doesNotContain("In progress");
    }
}
