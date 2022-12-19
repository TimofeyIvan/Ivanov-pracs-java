package ru.mirea.lab2.Shop;
import java.util.Scanner;
public class ShopTest {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Shop shop = new Shop();

        String command = "";
        String inputedComputerName = "No pc name";

        System.out.println("Для указания введите команду");
        System.out.println("Если хотите добавить комп, то пишите add");
        System.out.println("Если хотите удалить комп, то пишите delete");
        System.out.println("Если хотите найти комп,то пишите find");
        System.out.println("Если хотите закончить, то пишите END");

        command = scanner.next();

        while(!(command.equals("END")))
        {
            System.out.print("Название компьютера: ");
            inputedComputerName = scanner.next();
            switch (command)
            {
                case "add":
                    shop.AddComputer(inputedComputerName);
                    System.out.println("Компьютер: " + inputedComputerName + " добавлен в магазин");
                    break;
                case "delete":
                    shop.DeleteComputer(inputedComputerName);
                    break;
                case "find":
                    shop.FindComputer(inputedComputerName);
                    break;
            }

            command = scanner.next();
        }

        inputedComputerName = scanner.next();
    }
}
