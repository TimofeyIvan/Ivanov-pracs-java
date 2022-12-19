package ru.mirea.lab5.practice;
import javax.swing.*;
import java.awt.*;
public class FirstGui {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame("test");
                frame.setSize(1000, 400);

                JLabel jLabel = new JLabel("HomeLander Tired of Java Homework ((((");
                Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/lab5/task4/homelander-the-boys-season3.gif");
                ImageIcon imageIcon = new ImageIcon(image);
                imageIcon.setImageObserver(jLabel);
                jLabel.setIcon(imageIcon);

                frame.add(jLabel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setVisible(true);
            }
        });
    }
}

