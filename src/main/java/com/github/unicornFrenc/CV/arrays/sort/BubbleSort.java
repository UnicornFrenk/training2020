package com.github.unicornFrenc.CV.arrays.sort;

public class BubbleSort {

    private long[] array;
    private int countOfElems;

    public BubbleSort(int max) {
        array = new long[max];
        countOfElems = 0;
    }


    public void insert(long value) {
        array[countOfElems] = value;
        countOfElems++;
    }

    public void display() {
        for (int i = 0; i < countOfElems; i++) {
            System.out.print(array[i] + "  ");
        }
    }



    //сложность O(N2)
    public void bubbleSort() {
        int out, in;
        for (out = countOfElems - 1; out > 1; out--)   //обратный внешний цикл
            for (in = 0; in < out; in++)    // внутренний прямой цикл
                if (array[in] > array[in + 1]) swap(in, in + 1);
    }


    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
