package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

//создаем класс, который будет создавать массив,
//наполнять его рандомными фигурами
//и выводить информацию о них в консоли
class TestStarter {

    //метод для ручного ввода количества символов в массиве
    //и работа с исключением в случае ввода не численного значения
    private static int setLenght() {

        while (true) {

            System.out.println("Введите количество фигур в массиве");

            try {
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Введенные символы не являются числом!");
            }

        }
    }

    //создаем статичный метод, чтобы его можно
    //было вызывать без создания экземпляра класса
    static void start() {
        //создаем массив
        Shape[] shapeSet = new Shape[setLenght()];

        //создаем требуемое количество новых фигур
        // случайного типа и наполняем ими массив
        for (int i = 0; i < shapeSet.length; i++) {
            int randNumber = (int) (Math.random() * 4);
            switch (randNumber) {
                case 0:
                    shapeSet[i] = new Triangle();
                    break;

                case 1:
                    shapeSet[i] = new Square();
                    break;

                case 2:
                    shapeSet[i] = new Circle();
                    break;

                case 3:
                    shapeSet[i] = new Trapeze();
                    break;
            }
        }

        //для всех фигур массива выводим в консоль их тип,
        //цвет, основные парметры и площадь
        for (Shape i : shapeSet) {
            i.drow();
            System.out.println("Фигура: " + i.getType() + "; Цвет: " + i.getColor() + "; " + i.getMainInfo() + " площадь: " + i.getSquare() + "кв.ед.");

        }


    }
}