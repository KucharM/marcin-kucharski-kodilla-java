package com.kodilla.testing.shape;

class Triangle implements Shape {

    int lengthOfBase;
    int height;

    public Triangle(int lengthOfBase, int height) {
        this.lengthOfBase = lengthOfBase;
        this.height = height;
    }

    public void getShapeName() {
        System.out.println("i am a triangle");
    }

    public double getField() {
        return (height * lengthOfBase) / 2;
    }
}
