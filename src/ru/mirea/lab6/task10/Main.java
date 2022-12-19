package ru.mirea.lab6.task10;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        System.out.print("Введите количество компьютеров: ");
        Scanner scanner = new Scanner(System.in);

        int computersCount = scanner.nextInt();
        Shop shop = new Shop(computersCount);

        String inputedComputerName = "No pc name";
        while(shop.GetCurrentComputersCount() < shop.GetMaxComputersCount())
        {
            System.out.print(String.format("Введете название компьютера под № %s: ", shop.GetCurrentComputersCount() + 1));
            inputedComputerName = scanner.next();
            shop.AddComputer(new Computer(inputedComputerName));
            System.out.println("Компьютер : " + inputedComputerName + " добавлен в магазин");
        }

        System.out.println(String.format("Компьютеры в магазине базы данных: \n%s", shop.ToString()));


        System.out.print("Введите название компьютера, который вы хотите найти: ");
        inputedComputerName = scanner.next();

        boolean computerFound = shop.FindComputer(inputedComputerName);

        if(computerFound == true)
            System.out.println("Компьютер есть в магазине");
        else
            System.out.println("Компьютера нету в магазине");
    }
}
