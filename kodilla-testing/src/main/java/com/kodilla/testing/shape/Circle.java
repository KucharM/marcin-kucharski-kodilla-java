package com.kodilla.testing.shape;

class Circle implements Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public void getShapeName() {
        System.out.println("i am a circle");
    }

    public double getField() {
        return 3.14 * radius * radius;
    }
}
