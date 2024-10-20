package com.teachmeskills.hw.lesson_7.task2;

public abstract class Figure {

    String figureName;

    Figure(String figureName) {
        this.figureName = figureName;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
