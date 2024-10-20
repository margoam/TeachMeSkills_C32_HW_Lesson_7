package com.teachmeskills.hw.lesson_7.task2;

public class Circle extends Figure {

    private final double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
}
