package ru.mirea.lab2.Ball;

public class TestBall {
    public static void main(String[] args)
    {
        Ball ball = new Ball(20,20);
        ball.SetXY(5,5);
        ball.GetX();
        ball.GetY();
        ball.Move(-500,5);
        System.out.print(String.format("Шар стоит в точке: %s:%s",ball.GetX(), ball.GetY()));
    }
}
