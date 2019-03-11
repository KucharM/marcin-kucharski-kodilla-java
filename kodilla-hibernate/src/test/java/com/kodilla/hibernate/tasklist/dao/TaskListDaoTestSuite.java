package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklists.TaskList;
import com.kodilla.hibernate.tasklists.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("test TaskList", "testing TaskLists");
        taskListDao.save(taskList);
        String taskListName = taskList.getListName();

        //When
        List<TaskList> foundTaskList = taskListDao.findByListName(taskListName);

        //Then
        Assert.assertEquals(1, foundTaskList.size());
        Assert.assertEquals("test TaskList", foundTaskList.get(0).getListName());

        //CleanUp
        int id = foundTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
