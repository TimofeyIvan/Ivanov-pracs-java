package ru.mirea.lab2.circl;

public class Circle {

    private int diameter = 0;
    private int radius = 0;
    private double length = 0;
    private double square = 0;

    Circle(int radius)
    {
        this.radius = radius;
        square = radius * radius * 3.14;
        diameter = radius*2;
        length = radius*2 * 3.14;
    }

    public void SetRadius()
    {
        this.radius = radius;
        square = radius * radius * 3.14;
        diameter = radius*2;
        length = radius*2 * 3.14;
    }

    public int GetRadius()
    {
        return radius;
    }

    public int GetDiameter()
    {
        return diameter;
    }

    public double GetSquare()
    {
        return square;
    }

    public double GetLength()
    {
        return length;
    }
}
