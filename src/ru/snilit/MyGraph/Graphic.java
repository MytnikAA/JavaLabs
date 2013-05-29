package ru.snilit.MyGraph;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JFrame {

    Graphic(String s) {
        super(s);
        setLayout(null);
        setSize(120, 200);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        JButton sin = new JButton("Sin");
        sin.setBounds(5, 20, 100, 25);
        add(sin);
        JButton cos = new JButton("Cos");
        cos.setBounds(5, 70, 100, 25);
        add(cos);
        JButton x2 = new JButton("Парабола");
        x2.setBounds(5, 120, 100, 25);
        add(x2);
        sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                new Sinus("Синус");
            }
        });
        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                new Cosinus("Косинус");
            }
        });
        x2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                new X2("Парабола");
            }
        });
    }

    public static void main(String[] args) {
        new Graphic("Графопостроитель");
    }
}
