package com.github.unicornFrenc.CV.arrays.sort;

public class SelectSort {


    private long[] array;
    private int count;


    public SelectSort(int max) {
        array = new long[max];
        count = 0;
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < count - 1; out++) {
            min = out;
            for (in = out + 1; in < count; in++)
                if (array[in] < array[min]) min = in;
            swap(out, min);
        }
    }

    public void insert(long value) {
        array[count] = value;
        count++;
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + "  ");
        }
    }


    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

}
