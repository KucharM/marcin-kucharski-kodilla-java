package com.kodilla.good.patterns.challenges.food2Door;

public class FoodProducer {

    private String producerName;

    public FoodProducer(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public String toString() {
        return "FoodProducer: " + producerName;
    }
}
