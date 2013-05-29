package ru.snilit;

import java.awt.*; // Импорт пакета awt
import java.awt.event.*; // Импорт пакета обработки событий
import javax.swing.*; // Импорт пакета swing

public class Calculator extends JFrame {

    double temp;
    char op;

    Calculator(String s) { // Начало определения конструктора Calculator
        super(s); // Вызов конструктора суперкласса (JFrame) 
        temp = 0;
        op = ' ';
        setLayout(new GridBagLayout()); // Отказ от менеджера размещения
        setSize(250, 250); // Установка размеров окна
        setVisible(true); // Установка видимости на экране
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Установка по умолчанию для закрытия окна
        final JTextField disp = new JTextField("");
        disp.setEditable(false);
        disp.setBounds(3, 4, 238, 23);
        add(disp); // Добавление поля ввода в контейнер окна
        JButton btn_1 = new JButton("1");
        btn_1.setBounds(2, 30, 40, 40);
        add(btn_1);
        JButton btn_2 = new JButton("2");
        btn_2.setBounds(52, 30, 40, 40);
        add(btn_2);
        JButton btn_3 = new JButton("3");
        btn_3.setBounds(102, 30, 40, 40);
        add(btn_3);
        JButton btn_4 = new JButton("4");
        btn_4.setBounds(2, 80, 40, 40);
        add(btn_4);
        JButton btn_5 = new JButton("5");
        btn_5.setBounds(52, 80, 40, 40);
        add(btn_5);
        JButton btn_6 = new JButton("6");
        btn_6.setBounds(102, 80, 40, 40);
        add(btn_6);
        JButton btn_7 = new JButton("7");
        btn_7.setBounds(2, 130, 40, 40);
        add(btn_7);
        JButton btn_8 = new JButton("8");
        btn_8.setBounds(52, 130, 40, 40);
        add(btn_8);
        JButton btn_9 = new JButton("9");
        btn_9.setBounds(102, 130, 40, 40);
        add(btn_9);
        JButton btn_0 = new JButton("0");
        btn_0.setBounds(2, 180, 40, 40);
        add(btn_0);
        JButton btn_eq = new JButton("=");
        btn_eq.setBounds(52, 180, 90, 40);
        add(btn_eq);
        JButton btn_plus = new JButton("+");
        btn_plus.setBounds(152, 30, 80, 40);
        add(btn_plus);
        JButton btn_minus = new JButton("-");
        btn_minus.setBounds(152, 80, 80, 40);
        add(btn_minus);
        JButton btn_mul = new JButton("*");
        btn_mul.setBounds(152, 130, 80, 40);
        add(btn_mul);
        JButton btn_div = new JButton("/");
        btn_div.setBounds(152, 180, 80, 40);
        add(btn_div);
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "1");
            }
        });
        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "2");
            }
        });
        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "3");
            }
        });
        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "4");
            }
        });
        btn_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "5");
            }
        });
        btn_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "6");
            }
        });
        btn_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "7");
            }
        });
        btn_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "8");
            }
        });
        btn_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "9");
            }
        });
        btn_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                disp.setText(disp.getText() + "0");
            }
        });
        btn_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                op = '+';
                temp = Double.valueOf(disp.getText());
                disp.setText("");
            }
        });
        btn_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                op = '-';
                temp = Double.valueOf(disp.getText());
                disp.setText("");
            }
        });
        btn_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                op = '/';
                temp = Double.valueOf(disp.getText());
                disp.setText("");
            }
        });
        btn_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                op = '*';
                temp = Double.valueOf(disp.getText());
                disp.setText("");
            }
        });
        btn_eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (op) {
                    case '+':
                        disp.setText(String.valueOf(temp + Double.valueOf(disp.getText())));
                        break;
                    case '-':
                        disp.setText(String.valueOf(temp - Double.valueOf(disp.getText())));
                        break;
                    case '*':
                        disp.setText(String.valueOf(temp * Double.valueOf(disp.getText())));
                        break;
                    case '/':
                        disp.setText(String.valueOf(temp / Double.valueOf(disp.getText())));
                        break;
                }
            }
        });

    } // Завершение конструктора Calculator

    public static void main(String[] args) { // Начало метода main()
        new Calculator("Calculator"); // Создание объекта Calculator
    } // Завершение метода main()
} // Завершение класса Calculator
