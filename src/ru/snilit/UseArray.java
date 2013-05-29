package ru.snilit;

class UseArray {

    private static short getMin() {
        short x;
        short[] myArray = new short[10];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < 10; i++) {
            myArray[i] = (short) Math.round(50 * Math.random());
            System.out.println(myArray[i] + ", ");
        }
        x = myArray[0];
        for (int i = 1; i < 10; i++) {
            if (x > myArray[i]) {
                x = myArray[i];
            }
        }
        return x;
    }

    private static void sortArray() {
        short temp;
        short[] myArray = new short[10];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < 10; i++) {
            myArray[i] = (short) Math.round(50 * Math.random());
            System.out.println(myArray[i] + ", ");
        }
        System.out.println("Массив отсортированный: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 9; j > i; j--) {
                if (myArray[j - 1] > myArray[j]) {
                    temp = myArray[j];
                    myArray[j] = myArray[j - 1];
                    myArray[j - 1] = temp;
                }
            }
            System.out.println(myArray[i] + ", ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Минимальный элемент: " + getMin());
        sortArray();
    }
}
