package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";


    public Task makeTask(String taskName) {
        switch (taskName) {
            case DRIVING_TASK:
                return new DrivingTask("to work", "work", "car");
            case SHOPPING_TASK:
                return new ShoppingTask("buy milk", "milk", 2);
            case PAINTING_TASK:
                return new PaintingTask("paint wall", "red", "wall in bedroom");
            default:
                return null;
        }
    }
}
