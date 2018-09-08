package com.company;

//наследуем класс Треугольник от класса Фигура
class Triangle extends Shape {

    //прописываем его основные параметры - длину основания и высоту
    //и присваиваем им случайное целочисленное значение в промежутке от 1 до 9
    private int botBase = (int) (1 + Math.random() * 9);
    private int height = (int) (1 + Math.random() * 9);

    //реализуем абстрактные методы родительского класса
    @Override
    double getSquare() {
        return (botBase * height) / 2;
    }

    @Override
    String getMainInfo() {
        return ("Основание: " + botBase + "ед.; Высота: " + height + " ед.;");
    }

    @Override
    String getType() {
        return "треугольник";
    }
}
