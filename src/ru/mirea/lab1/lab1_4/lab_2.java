package ru.mirea.lab1.lab1_4;

import java.util.Scanner;

public class lab_2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        double[] array = new double[size];
        double sum = 0;
        double DoSum = 0;
        int i = 0;
        double max = 0;
        double min = 6400000;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите числа для вашего массива ");

        while (i < size ) {
            array[i] = input.nextInt();
            sum += array[i];
            i++;
        }
        int j = 0;
        do {
            DoSum += array[j];
            j++;
        }while (j<size);
        for (int m = 0; m < size; m++){
            if (array[m] > max)
                max = array[m];
            if (array[m] < min)
                min = array[m];
        }
        System.out.println("Сумма элементов while " + sum);
        System.out.println("Cумма dowhile " + DoSum);
        System.out.println("Максимальное " + max);
        System.out.println("Минимальное " + min);
    }
}
