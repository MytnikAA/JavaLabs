package ru.snilit.MyGraph;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ExtEventHandler extends JFrame {

    ExtEventHandler(String s) {
        super(s);
        setLayout(null);
        setSize(150, 250);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton button_1 = new JButton("Первая кнопка");
        button_1.setBounds(2, 5, 96, 22);
        add(button_1);
        JButton button_2 = new JButton("Вторая кнопка");
        button_2.setBounds(2, 100, 96, 22);
        add(button_2);
        button_1.addActionListener(new Handler(button_1, button_2));
        button_2.addActionListener(new Handler(button_1, button_2));
    }

    public static void main(String[] args) {
        new ExtEventHandler("");
    }
}

class Handler implements ActionListener {

    private JButton button_a;
    private JButton button_b;
    String temp;

    Handler(JButton button_1, JButton button_2) {
        this.button_a = button_1;
        this.button_b = button_2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        temp = button_a.getLabel();
        button_a.setLabel(button_b.getLabel());
        button_b.setLabel(temp);
    }
}
