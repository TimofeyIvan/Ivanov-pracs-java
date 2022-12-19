package ru.mirea.lab2.test;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args){
        double r;
        circle k1 = new circle(3.1, 4.1, 5.1, "\u001B[31m");
    System.out.println("Длина окружности = " + k1.getPerimetr() + " см\n");
    Scanner source = new Scanner(System.in);
    System.out.println("Введите радиус ");
    r = source.nextDouble();
    k1.setR(r);
    System.out.println("\nДлина окружнсоти = " + k1.getPerimetr() + " см");
    }
}
