package ru.mirea.lab4.lab4_1.task8;

public class circle extends Shape {
    protected double radius;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    double gerArea() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
