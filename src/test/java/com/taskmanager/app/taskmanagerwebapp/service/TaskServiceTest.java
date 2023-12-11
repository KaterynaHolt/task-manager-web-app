package com.taskmanager.app.taskmanagerwebapp.service;
import com.taskmanager.app.taskmanagerwebapp.model.Data;
import com.taskmanager.app.taskmanagerwebapp.model.Task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.*;

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
        Data data = taskService.getAllTasks();
        //THEN
        assertThat(data.getIncompleted()).extracting(Task::getStatus).doesNotContain("Completed");
        assertThat(data.getCompleted()).extracting(Task::getStatus).contains("Completed");
        assertThat(data.getCompleted()).extracting(Task::getStatus).doesNotContain("Incompleted");
        assertThat(data.getCompleted()).extracting(Task::getStatus).doesNotContain("Pending");
        assertThat(data.getCompleted()).extracting(Task::getStatus).doesNotContain("In progress");
    }
}
