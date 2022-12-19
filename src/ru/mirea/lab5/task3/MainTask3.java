package ru.mirea.lab5.task3;

import ru.mirea.lab5.task2.Main;

import java.awt.*;
import javax.swing.*;

public class MainTask3 extends JComponent {
    Image tadaaaa = new ImageIcon("src/ru/mirea/lab5/task3/tadaaaa.png").getImage();
    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(tadaaaa, 0, 0,null);
    }

    public static void main(String args[]) {
        MainTask3 t = new MainTask3();
        JFrame frame = new JFrame("Shrek");
        frame.setSize(800, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MainTask3());
        frame.setVisible(true);
    }
}
