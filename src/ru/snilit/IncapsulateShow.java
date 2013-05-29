package ru.snilit;

public class IncapsulateShow {

    public int field_1 = 10;
    protected int field_2 = 15;
    int field_3 = 20;
    private int field_4 = 25;

    public int getfield_4() {
        return this.field_4;
    }

    public static void main(String[] args) {
        new Klazz().methodOne();
    }
}

class Klazz extends IncapsulateShow {

    public void methodOne() {
        System.out.println(
                "Значение открытого public поля field_1: " + this.field_1);
        System.out.println(
                "Значение защищенного protected поля - field_2: " + this.field_2);
        System.out.println(
                "Значение поля без модификатора field_3: " + this.field_3);
        System.out.println("Значение инкапсулированного закрытого private поля - field_4: " + getfield_4());
    }
}
