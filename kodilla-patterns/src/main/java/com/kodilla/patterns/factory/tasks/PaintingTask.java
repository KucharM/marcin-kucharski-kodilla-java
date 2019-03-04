package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getWahtToPaint() {
        return whatToPaint;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "executing PaintingTask Task: " + getTaskName() + ", " + getWahtToPaint() + ", " + getColor();
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
