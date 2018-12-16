package com.kodilla.testing.shape;

class Square implements Shape {

    int side;

    public Square(int side) {
        this.side = side;
    }
    public void getShapeName() {
        System.out.println("i am a square");
    }

    public double getField() {
        return side * side;
    }
}
