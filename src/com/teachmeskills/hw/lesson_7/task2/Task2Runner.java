package com.teachmeskills.hw.lesson_7.task2;

/**
 * Задача 2:
 * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
 * Создать массив из 5 разных фигур.
 * Пройтись циклом по массиву и вывести информацию о каждой фигуре.
 * Вывести на экран сумму периметров всех фигур в массиве.
 */
public class Task2Runner {

    public static void main(String[] args) {

        double perimeterSum = 0;

        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 2, 3);
        figures[1] = new Rectangle(23, 54);
        figures[2] = new Circle(55);
        figures[3] = new Rectangle(12.4, 7.5);
        figures[4] = new Triangle(5, 6, 7);

        for (Figure figure : figures) {
            System.out.println("Figure is: " + figure.figureName);
            System.out.println("Area: " + Math.round(figure.calculateArea()));
            System.out.println("Perimeter: " + Math.round(figure.calculatePerimeter()) + "\n");

            perimeterSum += Math.round(figure.calculatePerimeter());
        }

        System.out.println("Total perimeters sum: " + Math.round(perimeterSum));
    }
}
