package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String wahtToBuy;
    private double quantity;
    private boolean isExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.wahtToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getWahtToBuy() {
        return wahtToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "executing Shopping Task: " + getTaskName() + ", " + getWahtToBuy() + ", " + getQuantity();
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
