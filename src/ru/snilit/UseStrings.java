package ru.snilit;

public class UseStrings {

    public static String compareStr(String s1, String s2) {
        String s3 = "";
        if (s1.equals(s2)) {
            s3 = "Строки \"" + s1 + "\" и \"" + s2 + "\" равны";
        } else {
            s3 = "Строки \"" + s1 + "\" и \"" + s2 + "\" не равны";
        }
        return s3;
    }

    public static String unionWords(String str1, String str2) {
        System.out.println("Результат сложения строк \"" + str1 + "\" и " + "\"" + str2 + "\": ");
        str1 += " " + str2;
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(compareStr("qwerty", "qwe"));
        System.out.println(compareStr("qwe", "qwe"));
        System.out.println(unionWords("Hello", "Java"));
    }
}
