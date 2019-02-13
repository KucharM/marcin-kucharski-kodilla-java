package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Order for: " + user.getUserName() + " for a: " + product.getProductName() + " was created!");
    }
}
