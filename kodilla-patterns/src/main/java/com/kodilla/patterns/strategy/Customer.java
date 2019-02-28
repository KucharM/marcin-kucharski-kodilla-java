package com.kodilla.patterns.strategy;

public class Customer {
    private final String name;
    protected BuyPredictor buyPredictor;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict() {
        return buyPredictor.predictWhatBuy();
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }
}