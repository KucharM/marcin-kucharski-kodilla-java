package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String name;
    private int taskCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println("New task to check: " + student.getStudentName());
        taskCount++;
    }

    public String getName() {
        return name;
    }

    public int getTaskCount() {
        return taskCount;
    }
}
