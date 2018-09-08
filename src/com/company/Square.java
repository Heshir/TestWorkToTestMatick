package com.company;

//наследуем класс Квадрат от класса Фигура
class Square extends Shape {

    //прописываем его основной параметр - длину стороны
    //и присваиваем ей случайное целочисленное значение в промежутке от 1 до 9
    private int side = (int) (1 + Math.random() * 9);

    //реализуем абстрактные методы родительского класса
    @Override
    double getSquare() {
        return side ^ 2;
    }

    @Override
    String getMainInfo() {
        return ("Сторона: " + side + ";");
    }

    @Override
    String getType() {
        return "квадрат";
    }
}
