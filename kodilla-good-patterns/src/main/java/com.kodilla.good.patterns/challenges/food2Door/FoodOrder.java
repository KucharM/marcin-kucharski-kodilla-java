package com.kodilla.good.patterns.challenges.food2Door;

public class FoodOrder implements OrderService {

    @Override
    public void process(Order order) {
        System.out.println("Processing: \n" + order);
    }
}
