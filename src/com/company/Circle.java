package com.company;

//наследуем класс Круг от класса Фигура
class Circle extends Shape {

    //прописываем его основной параметр - радиус
    //и присваиваем ему случайное целочисленное значение в промежутке от 1 до 9
    private int radius = (int) (1 + Math.random() * 9);

    //реализуем абстрактные методы родительского класса
    @Override
    double getSquare() {
        return Math.PI * (radius ^ 2);
    }

    @Override
    String getMainInfo() {
        return "Радиус: " + radius + ";";
    }

    @Override
    String getType() {
        return "круг";
    }
}
