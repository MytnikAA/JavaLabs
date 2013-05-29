package ru.snilit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import javax.swing.JButton;

public class AppletShow2 extends Applet {

    @Override
    public void init() {
        setLayout(null);
        final TextField textField_1 = new TextField(15);
        textField_1.setBounds(1, 1, 150, 30);
        add(textField_1);
        final TextField textField_2 = new TextField(15);
        textField_2.setBounds(1, 25, 150, 30);
        add(textField_2);
        final TextField textField_3 = new TextField(15);
        textField_3.setBounds(1, 50, 150, 30);
        add(textField_3);
        JButton b1 = new JButton("Кнопка 1");
        b1.setBounds(1, 150, 150, 30);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    textField_3.setText(String.valueOf((Long.valueOf(textField_1.getText()) + Long.valueOf(textField_2.getText()))));
                } catch (Exception e) {
                    textField_3.setText("Введите числа");
                }
            }
        });
    }
}
