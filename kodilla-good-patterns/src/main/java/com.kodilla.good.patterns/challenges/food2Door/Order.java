package com.kodilla.good.patterns.challenges.food2Door;

public class Order {
    private FoodProducer foodProducer;
    private Product product;

    public Order(FoodProducer foodProducer, Product product) {
        this.foodProducer = foodProducer;
        this.product = product;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Order: " + foodProducer + ", " + product;
    }
}
