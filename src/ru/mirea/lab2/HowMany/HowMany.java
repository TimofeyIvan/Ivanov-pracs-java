package ru.mirea.lab2.HowMany;
import java.util.Scanner;
public class HowMany {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

            System.out.println("Кол-во введенных слов: " + text.split("").length);
    }
}
