package com.github.unicornFrenc.CV.arrays.sort;

public class SelectionSortMain {

    public static void main(String[] args) {


        int maxSize = 100;
        SelectSort selectSort;
        selectSort = new SelectSort(maxSize);


        selectSort.insert(100);
        selectSort.insert(10);
        selectSort.insert(1);
        selectSort.insert(1000);
        selectSort.insert(10000);
        selectSort.insert(1002);
        selectSort.insert(1001);

        selectSort.display();
        selectSort.selectionSort();
        System.out.println("");

        selectSort.display();
    }
}
