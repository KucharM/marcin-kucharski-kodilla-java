package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        boolean isExecuted = shoppingTask.isTaskExecuted();

        //Then
        Assert.assertTrue(isExecuted);
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();
        boolean isExecuted = drivingTask.isTaskExecuted();

        //Then
        Assert.assertTrue(isExecuted);
    }

    @Test
    public void testFactoryPaintngTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        boolean isExecuted = paintingTask.isTaskExecuted();

        //Then
        Assert.assertTrue(isExecuted);
    }
}
