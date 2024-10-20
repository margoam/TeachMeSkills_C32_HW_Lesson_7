package com.teachmeskills.hw.lesson_7.task2;

public class Rectangle extends Figure {

    private  final  double length;
    private  final  double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}
