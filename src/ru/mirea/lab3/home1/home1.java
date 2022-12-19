package ru.mirea.lab3.home1;
import  java.util.Random;
public class home1 {
    public static void main(String[] args) {
        double p = 28;
        System.out.println("expm1 of a is: " + Math.exp(p));
        System.out.println(Integer.parseInt("F", 16));
        Integer num = 30;
        int i = 15;
        Integer a = i; //это автоупаковка
        System.out.println(a); // 15
        Integer x = new Integer(10); //конструктор Integer
        System.out.println(x);
        int b = x;//автораспаковка
        double m = 11.635;
        System.out.printf("Значение e = %.3f%n", Math.E);
        System.out.printf("exp(%.3f) = %.3f%n", m,
                Math.exp(m));
    }
}
