package ru.mirea.lab6.Task11new;

import java.util.Scanner;
/*
 * By Rishat Sultanov & corect private_tm.
 * Градусы по Фаренгейту = (градусы по Цельсию x 1.8) + 32
 * cоответственно, из 'F в 'C можно перевести по следующей
 * формуле: градусы по Цельсию = (градусы по Фаренгейту - 32) / 1.8
 */
public class conv{
    public static void main(String[] args) {
        int a;
        int d = 32;
        double c, c1;
        double b = 1.8;
        double k = 273.15;
        System.out.println("Введите градусы по цельсии:");
        a = new Scanner(System.in).nextInt();
        c1 = a + k;
        c = a * b + d;
        System.out.println("Ваши градусы в Фаренгейтах:" + c);
        System.out.println("Ваши градусы в Кельвинах:" + c1);
    }
}
