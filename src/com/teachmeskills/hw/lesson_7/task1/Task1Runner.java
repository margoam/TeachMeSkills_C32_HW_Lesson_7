package com.teachmeskills.hw.lesson_7.task1;

import java.util.Scanner;

/**
 * Задача 1:
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
 * Имплементировать этот метод в созданные классы.
 * Создать класс-раннер с методом мейн для запуска программы.
 * Запросить с консоли код должности и вывести название должности на экран.
 */
public class Task1Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Director director = new Director();
        Employee employee = new Employee();
        Accountant accountant = new Accountant();

        System.out.print("Please, enter a job code (Director - 1, Employee - 2, Accountant - 3): ");
        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                director.showJobDescription(director.jobTitle);
                break;
            case "2":
                employee.showJobDescription(employee.jobTitle);
                break;
            case "3":
                accountant.showJobDescription(accountant.jobTitle);
                break;
            default:
                System.out.println("Entered invalid job code.");
                break;
        }
    }
}
