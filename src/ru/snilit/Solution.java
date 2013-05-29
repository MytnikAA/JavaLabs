package ru.snilit;

public class Solution {

    public static void go() {
        long x = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    x = i * 100 + j * 10 + k;
                    if (x == (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3))) {
                        System.out.print(i + "^3+" + j + "^3+" + k + "^3+" + " = " + x);
                    }
                }
            }
        }
    }

    public static void main(String argums[]) {
        go();
    }
}
