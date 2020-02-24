package com.github.unicornFrenc.CV.arrays.sort;

public class BubbleSortMain {

    public static void main(String[] args) {
        int maxSize = 100;
        BubbleSort bubbleArray;
        bubbleArray = new BubbleSort(maxSize);

        bubbleArray.insert(100);
        bubbleArray.insert(10);
        bubbleArray.insert(110);
        bubbleArray.insert(1);
        bubbleArray.insert(12);
        bubbleArray.insert(1000);
        bubbleArray.insert(666);
        bubbleArray.insert(150);
        bubbleArray.insert(15);
        bubbleArray.insert(18);


        bubbleArray.display();
        System.out.println(" ");

        bubbleArray.bubbleSort();
        bubbleArray.display();
    }


}
