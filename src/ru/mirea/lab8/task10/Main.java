package ru.mirea.lab8.task10;

import java.util.Scanner;

public class Main {

        public static String reverse(String str) {
        return str.isEmpty() ? "" : reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            System.out.println("Reversed: " + reverse(String.valueOf(scan.nextInt())));
        }
    }
}

