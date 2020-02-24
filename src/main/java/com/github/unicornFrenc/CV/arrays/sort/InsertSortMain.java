package com.github.unicornFrenc.CV.arrays.sort;

public class InsertSortMain {

    public static void main(String[] args) {


        int maxSize = 100;
        InsertSort insertSort;
        insertSort = new InsertSort(maxSize);


        insertSort.insert(1);
        insertSort.insert(10);
        insertSort.insert(100);
        insertSort.insert(1000);
        insertSort.insert(12);
        insertSort.insert(1002);
        insertSort.insert(1001);

        insertSort.display();
        insertSort.insertionSort();
        System.out.println("");

        insertSort.display();
    }
}
