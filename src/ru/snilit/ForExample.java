package ru.snilit;

public class ForExample {

    public static void main(String args[]) {
        int summa = 0;
        long produce = 1;
        System.out.println("Сумма\t\tПроизведение ");
        for (int i = 1; i < 10; i++) {
            summa += (int) Math.round(Math.random() * 10);
            produce *= (int) Math.round(Math.random() * 10);
            System.out.println(summa + "\t\t" + produce);
        }
    }
}
