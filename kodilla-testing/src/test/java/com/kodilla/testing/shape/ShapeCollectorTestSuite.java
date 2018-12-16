package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("I'm starting to test.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("I have finished testing");
    }

    @Before
    public void beforeTest() {
        System.out.println("I'm testing");
    }

    @Test
    public void addFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(4);
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 5);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        boolean containsCircle = shapeCollector.shapeList.contains(circle);
        boolean containsTriangle = shapeCollector.shapeList.contains(triangle);
        boolean containsSquare = shapeCollector.shapeList.contains(square);
        int shapeListSize = shapeCollector.shapeList.size();

        //Then
        Assert.assertTrue(containsCircle);
        Assert.assertTrue(containsSquare);
        Assert.assertTrue(containsTriangle);
        Assert.assertEquals(3, shapeListSize);
    }

    @Test
    public void removeFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape circle = new Circle(4);
        Shape square = new Square(4);
        shapeCollector.shapeList.add(circle);
        shapeCollector.shapeList.add(square);

        boolean isEmpty = shapeCollector.shapeList.isEmpty();
        boolean removedCircle = shapeCollector.removeFigure(circle);
        boolean containsCircle = shapeCollector.shapeList.contains(circle);
        int shapeListSize = shapeCollector.shapeList.size();

        //Then
        Assert.assertFalse(isEmpty);
        Assert.assertTrue(removedCircle);
        Assert.assertFalse(containsCircle);
        Assert.assertEquals(1, shapeListSize);
    }

    @Test
    public void getFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(4);
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 5);

        shapeCollector.shapeList.add(circle);
        shapeCollector.shapeList.add(square);
        shapeCollector.shapeList.add(triangle);

        //When
        Shape expectCircle = shapeCollector.getFigure(0);
        Shape expectSquare = shapeCollector.getFigure(1);
        Shape expectTriangle = shapeCollector.getFigure(2);

        //Then
        Assert.assertEquals(circle, expectCircle);
        Assert.assertEquals(square, expectSquare);
        Assert.assertEquals(triangle, expectTriangle);
    }

    @Test
    public void showFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(4);
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 5);

        //When
        shapeCollector.shapeList.add(circle);
        shapeCollector.shapeList.add(square);
        shapeCollector.shapeList.add(triangle);

        ArrayList<Shape> listOfShapes = shapeCollector.showFigures();

        ArrayList<Shape> expectList = new ArrayList<>();
        expectList.add(circle);
        expectList.add(square);
        expectList.add(triangle);

        //Then
        Assert.assertEquals(listOfShapes, expectList);
    }
}
