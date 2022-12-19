package ru.mirea.lab6.Task1;

import ru.mirea.lab6.Task1.Movable;
import ru.mirea.lab6.Task1.MovablePoint;

public class Tester implements Movable {

    private int radious = 0;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    Tester(int x, int y, int xSpeed, int ySpeed)
    {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveUp() {

    }

    @Override
    public String toString()
    {
        return "string";
    }
}
