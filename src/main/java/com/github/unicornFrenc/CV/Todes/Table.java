package com.github.unicornFrenc.CV.Todes;

public class Table {

    public static void main(String[] args) {
        table(2, 5);
        System.out.println();
        table(6, 9);

    }

    static void table(int first, int last) {
        for (int j = 1; j <= 10; j++) {
            for (int i = first; i <= last; i++) {
                System.out.printf("%2d  X %2d = %2d   ", i, j, i * j);
            }
            System.out.println();
        }
    }
}

