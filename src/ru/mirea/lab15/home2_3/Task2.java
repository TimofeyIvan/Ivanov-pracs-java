package ru.mirea.lab15.home2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Task2 extends JFrame {
    public JComboBox comboBox;
    public JLabel name;
    Task2()
    {
        super("Задание 15-2");
        super.setBounds(470, 250, 400, 300);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setLayout(new BorderLayout());

        String[] country = {"Russia", "China", "England", "Australia"};

        comboBox=new JComboBox<>(country);
        name = new JLabel();

        super.add(comboBox,BorderLayout.NORTH);
        super.add(name,BorderLayout.CENTER);

        comboBox.addActionListener(new Act());
    }

    private class Act implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            switch (comboBox.getSelectedIndex())
            {
                case 0:
                    name.setText("Население: 146 171 015 чел.");
                    break;
                case 1:
                    name.setText("Население: 1 410 539 758 чел.");
                    break;
                case 2:
                    name.setText("Население: 67 081 000 чел.");
                    break;

                case 3:
                    name.setText("Население: 27 937 296 чел.");

            }

        }
    }
}
