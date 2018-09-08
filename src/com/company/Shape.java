package com.company;

abstract class Shape {

    //Создаем массив из нескольких цветов
    private String[] colorSet = new String[]{"красный", "синий", "зеленый"};

    //выбираем рандомный цвет из массвиа и присваиваем его фигуре
    private int rand = (int) (Math.random() * colorSet.length);
    private String color = colorSet[rand];

    //геттер для цвета
    String getColor() {
        return color;
    }

    //метод для нарисования фигуры. По сути. тут может быть что угодно.
    void drow() {
        System.out.println("Нарисован");
    }

    //абстрактные методы для получения площади, основной информации и типа фигуры
    abstract double getSquare();

    abstract String getMainInfo();

    abstract String getType();

}
