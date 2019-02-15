package com.kodilla.good.patterns.challenges.food2Door;

public class App {
    public static void main(String[] args) {
        Order order = new Order(new FoodProducer("HealthyFood"), new Product("gluten-free bread", 100));

        FoodOrder foodOrder = new FoodOrder();
        foodOrder.process(order);
    }
}
