package ru.mirea.lab1.lab1__7;
import java.util.Scanner;
public class lab_7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите факториал числа: ");
        int fac = scanner.nextInt();

        int result = 1;
        for(int num = 1; num <= fac; num++)
        {
            result *= num;
        }

        System.out.print("Факториал числа "+ fac +": " + result);
    }
}
