package ru.mirea.lab3.home;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
public class home3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numbers = new int[11];
        //заполнение массива случайными числами
        for(int i=0;i<numbers.length;i++) {
            numbers[i] = rnd.nextInt(20);
            System.out.print(numbers[i] + " ");

        }//сортировка
        System.out.println();
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }

        }

        //вывод сортрованного массива
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
