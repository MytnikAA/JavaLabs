package ru.snilit;

public class PolymorphShow {

    void methodOne() {
        System.out.println("вызван метод суперкласса PolymorphShow");
    }

    public static void main(String argums[]) {
        PolymorphShow show =  new KlazzOne();
        show.methodOne();
        show = new KlazzTwo();
        show.methodOne();
    }
}

class KlazzOne extends PolymorphShow {

    @Override
    void methodOne() {
        System.out.println("Это был вызван метод класса потомка KlazzOne");
    }
}

class KlazzTwo extends PolymorphShow {

    @Override
    void methodOne() {
        System.out.println("Это был вызван метод класса потомка KlazzTwo");
    }
}
