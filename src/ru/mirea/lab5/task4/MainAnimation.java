package ru.mirea.lab5.task4;
import ru.mirea.lab5.task2.Main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
public class MainAnimation extends JComponent implements  KeyListener, ActionListener {
    private int x = 0;
    private int y = 0, H = 20, W = 20;
    Rectangle rectangle = new Rectangle(x,y,W,H);
    Timer timer = new Timer(5, this);

    public static void main(String[] args){
        MainAnimation t = new MainAnimation();
        JFrame f = new JFrame("Game");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(750, 400);
        f.add(t);
        f.addKeyListener(t);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        Graphics2D g1 = (Graphics2D)g;
        g1.fill(rectangle);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            rectangle.setLocation(rectangle.x+1,rectangle.y);
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            rectangle.setLocation(rectangle.x-1,rectangle.y);
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            rectangle.setLocation(rectangle.x,rectangle.y-1);
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            rectangle.setLocation(rectangle.x,rectangle.y+1);
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN && e.getKeyCode()==KeyEvent.VK_RIGHT){
            rectangle.setLocation(rectangle.x+1,rectangle.y+1);
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN && e.getKeyCode()==KeyEvent.VK_LEFT){
            rectangle.setLocation(rectangle.x-1,rectangle.y+1);
        }
        if(e.getKeyCode()==KeyEvent.VK_UP && e.getKeyCode()==KeyEvent.VK_RIGHT){
            rectangle.setLocation(rectangle.x+1,rectangle.y-1);
        }
        if(e.getKeyCode()==KeyEvent.VK_UP && e.getKeyCode()==KeyEvent.VK_LEFT){
            rectangle.setLocation(rectangle.x-1,rectangle.y-1);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
