package com.github.unicornFrenc.CV.arrays.sort;

public class ObjectSortApp {

    public static void main(String[] args) {
        int max = 100;
        ObjectSort arr;
        arr = new ObjectSort(max);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);


        System.out.println("Before: ");
        arr.display();
        arr.insertionSort();
        System.out.println("After: ");
        arr.display();
    }
}
