package ru.mirea.lab9.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Введите число а ");
        a=input.nextInt();
        System.out.print("Введите число b ");
        b=input.nextInt();

        if (a>b)
            System.out.println("a больше");
        else if (a<b)
            System.out.println("b больше");
        else System.out.println("a и b равны");


    }
}