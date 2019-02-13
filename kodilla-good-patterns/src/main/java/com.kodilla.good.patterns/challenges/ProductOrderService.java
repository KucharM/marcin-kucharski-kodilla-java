package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    @Override
    public boolean orderProduct(User user, Product product) {
        System.out.println("The product: " + product.getProductName() + " was ordered by: " + user.getUserName());
        return true;
    }
}
