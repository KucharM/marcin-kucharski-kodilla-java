package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John Smith");
        Product product = new Product("Nike shoes");

        return new OrderRequest(user, product);
    }
}
