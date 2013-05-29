package ru.snilit;

public class HeronSqrt {

    static double getSqrt(long arg) {
        double result = arg;
        int i = 0;
        while ((result * result > arg) && (i < 200)) {
            result = (result + arg / result) / 2;
            i++;
        }
        return result;
    }

    public static void main(String arg[]) {
        System.out.println(getSqrt(100));
    }
}
