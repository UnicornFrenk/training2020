package com.github.unicornFrenc.CV.arrays.sort;

public class MergeSort {

    public static void main(String[] args) {


        int[] arrayA = {23, 46, 57, 66};
        int[] arrayB = {12, 18};
        int[] arrayC = new int[6];

        merge(arrayA, 4, arrayB, 2, arrayC);
        display(arrayC,6);

    }

    public static void merge(int[] arrA, int sizeA, int[] arrB, int sizeB, int[] arrC) {


        int a = 0, b = 0, c = 0;
        while (a < sizeA && b < sizeB)       // Ни один из массивов не пуст
            if (arrA[a] < arrB[b]) arrC[c++] = arrA[a++];
            else arrC[c++] = arrB[b++];

        while (a < sizeA) arrC[c++] = arrA[a++];    // Массив arrB пуст
                                                    //в arrA остались элементы
        while (b < sizeB) arrC[c++] = arrB[b++];    // Массив arrA пуст
                                                    //в arrB остались элементы

    }

    public static void display(int[] array, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }
}
