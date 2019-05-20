package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable{
    private List<Observer> observerList;
    private List<String> tasks;
    private String studentName;

    public Student(String studentName) {
        observerList = new ArrayList<>();
        tasks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObserver();
    }

    @Override
    public void assignObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observerList) {
            o.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
