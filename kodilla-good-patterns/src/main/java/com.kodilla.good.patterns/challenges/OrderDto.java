package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private User user;
    private Product product;
    private boolean isRented;

    public OrderDto(User user, Product product, boolean isRented) {
        this.user = user;
        this.product = product;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isRented() {
        return isRented;
    }
}
