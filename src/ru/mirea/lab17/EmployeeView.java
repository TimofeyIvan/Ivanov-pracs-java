package ru.mirea.lab17;

public class EmployeeView {
    public void printWages(int s, int md, int wd)
    {
        System.out.println("Заработная плата: " + s/md*wd);
    }
}