package ru.mirea.lab7.task4;

public class Main
{
    public static void main(String args[])
    {
        MathCalculable mathFunc = new MathFunc();

        int radious = 2;
        int lengthOfCircle =  (int)(2 *radious * mathFunc.getPi());

        System.out.println(String.format("Длина круга: %s", lengthOfCircle));
    }
}
