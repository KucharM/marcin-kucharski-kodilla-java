package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class StudentTaskTestSuite {
    @Test
    public void testUpdateTasks() {
        //Given
        Student student1 = new Student("Marek");
        Student student2 = new Student("Kasia");
        Student student3 = new Student("Jarek");
        Student student4 = new Student("Donald");
        Student student5 = new Student("Grzegorz");

        Mentor mentor1 = new Mentor("Jan");
        Mentor mentor2 = new Mentor("Tomasz");

        student1.assignObserver(mentor1);
        student2.assignObserver(mentor2);
        student3.assignObserver(mentor2);
        student4.assignObserver(mentor1);
        student5.assignObserver(mentor1);

        //When
        student1.addTask("design patterns");
        student2.addTask("spring framework");
        student3.addTask("java collection");
        student4.addTask("exceptions in java");
        student5.addTask("objected programming");

        //Then
        Assert.assertEquals(3, mentor1.getTaskCount());
        Assert.assertEquals(2, mentor2.getTaskCount());
    }
}
