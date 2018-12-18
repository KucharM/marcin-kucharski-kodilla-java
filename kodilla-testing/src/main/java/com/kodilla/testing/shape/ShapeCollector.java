package com.kodilla.testing.shape;

import java.util.ArrayList;

class ShapeCollector {

    ArrayList<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean figure = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            figure = true;
        }
        return figure;
    }

    public Shape getFigure(int n) {

        if (n < 0 || n >= shapeList.size()) {
            return null;
        } else {
            return shapeList.get(n);
        }
    }

    public ArrayList<Shape> showFigures() {
        return shapeList;
    }

}
