package ru.gb.lesson1;
//Task1
public class Homework {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a+b>=c) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor() {
        int value = 3;
        if (value<=0) {
            System.out.println("Красный");
        }
        if (value>0 && value<=100); {
            System.out.println("Жёлтый");
        }
        if (value>100) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a>=b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}



