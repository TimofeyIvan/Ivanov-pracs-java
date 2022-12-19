package ru.mirea.lab1.lab1_3;
import java.util.Scanner;
public class lab1_1
{
    public static void main(String[] args)
    {
        double[] array = new double[10];
        double sum = 0;
        double aSum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 10чисел ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        for (int i = 0;i < array.length; i++) {
            sum += array[i];
        }
        aSum = sum/array.length;
        System.out.println("Сумма элементов " + sum);
        System.out.println("Арифметическая сумма " + aSum);
}}
