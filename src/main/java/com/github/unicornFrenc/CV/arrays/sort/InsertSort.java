package com.github.unicornFrenc.CV.arrays.sort;

public class InsertSort {

    private long[] a;
    private int nElems;


    public InsertSort(int max) {
        a = new long[max];
        nElems = 0;
    }


    public void insert(long val) {
        a[nElems] = val;
        nElems++;
    }


    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + "  ");
        }
    }


    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++)     // out - разделительный маркер
        {
            long temp = a[out];                // Скопировать помеченный элемент
            in = out;                          // Начать перемещения с out
            while (in > 0 && a[in - 1] >= temp) // Пока не найден меньший элемент
            {
                a[in] = a[in - 1];              // Сдвинуть элемент вправо
                --in;                           // Перейти на одну позицию влево
            }
            a[in] = temp;                       // Вставить помеченный элемент
        }
    }
}
