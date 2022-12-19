package ru.mirea.lab2.circl;

public class CircleTest {
    public static void main(String[] args)
    {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(788);

        System.out.println(String.format("1) Радиус: %s\nДиаметр: %s\nПлощадь: %s\nДлина окружности: %s",circle1.GetRadius(),circle1.GetSquare(),circle1.GetLength(),circle1.GetDiameter()));
        System.out.println(String.format("2) Радиус: %s\nДиаметр: %s\nПлощадь: %s\nДлина окружности: %s",circle2.GetRadius(),circle2.GetSquare(),circle2.GetLength(),circle2.GetDiameter()));
        if(circle1.GetDiameter() == circle2.GetDiameter()) {
            System.out.println("Круги равны");
        }else{
            System.out.println("Круги не равны");
        }
    }
}
