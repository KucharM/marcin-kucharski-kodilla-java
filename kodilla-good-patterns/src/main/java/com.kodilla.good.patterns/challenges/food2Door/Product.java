package com.kodilla.good.patterns.challenges.food2Door;

public class Product {

    private String productName;
    private int quantity;

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ProductName: " + productName + ", quantity: " + quantity;
    }
}
