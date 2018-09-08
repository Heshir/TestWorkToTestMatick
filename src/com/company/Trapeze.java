package com.company;

//наследуем класс Трапеция от класса Фигура
class Trapeze extends Shape {

    //прописываем его основные параметры - нижнее основание, верхнее основание и высоту
    //и присваиваем им случайное целочисленное значение в промежутке от 1 до 9
    private int upBase = (int) (1 + Math.random() * 9);
    private int botBase = (int) (1 + Math.random() * 9);
    private int height = (int) (1 + Math.random() * 9);

    //реализуем абстрактные методы родительского класса
    @Override
    double getSquare() {
        return ((upBase + botBase) / 2) * height;
    }

    @Override
    String getMainInfo() {
        return ("Верхнее основание:" + upBase + "; Нижнее основание: " + botBase + "; Высота: " + height + ";");
    }

    @Override
    String getType() {
        return "трапеция";
    }
}
