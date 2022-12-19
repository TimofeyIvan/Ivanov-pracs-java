package ru.mirea.lab5.task1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class task1 extends JFrame {
    int[] array = new int[123];
    int[] array1 = new int[123];
    int score1 = 0;
    int score2 = 0;
    boolean n;
    String LastScorer;
    String Winner;
    private JButton button = new JButton("AC Millan");
    private JButton button1 = new JButton("Real Madrid");
    private JLabel label = new JLabel("Result: ");
    private JLabel label2 = new JLabel("Last Scorer: ");
    private JLabel label3 = new JLabel("Winner: ");

    public task1 () {
        super("Simple Expl");
        this.setBounds(100, 100, 250, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        //container.add(label);
        //container.add(label2);
        //container.add(label3);
        button.addActionListener(new ButtonEvent());
        button1.addActionListener(new ButtonEvent1());
        container.add(button);
        container.add(button1);
        }
    class ButtonEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            score1 += 1;
            n = true;
            if(score1 >score2)
            {
                Winner = "AC Millan";
            }else if(score1 ==score2)
            {
                Winner = "DRAW";
            }else
            {
                Winner = "Real Madrid";
            }
            if (n = true) {
                LastScorer = "AC Millan";
            } else {
                LastScorer = "Real Madrid";
            }
            String message = "";
            message += label.getText() + score1 + " X " + score2 + "\n";
            message += label2.getText() + LastScorer + "\n";
            message += label3.getText() + Winner + "\n";
            JOptionPane.showMessageDialog(null, message, "RESULT", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class ButtonEvent1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            score2 += 1;
            n = true;
            if(score1 >score2)
            {
                Winner = "AC Millan";
            }else if(score1 ==score2)
            {
                Winner = "DRAW";
            }else
            {
                Winner = "Real Madrid";
            }
            if (n = false) {
                LastScorer = "AC Millan";
            } else {
                LastScorer = "Real Madrid";
            }
            String message = "";
            message += label.getText() + score1 + " X " + score2 + "\n";
            message += label2.getText() + LastScorer + "\n";
            message += label3.getText() + Winner + "\n";
            JOptionPane.showMessageDialog(null, message, "RESULT", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
