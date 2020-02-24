package com.github.unicornFrenc.CV.arrays;

public class ArrayTestMain {

    public static void main(String[] args) {
        ArrayTest array;
        array = new ArrayTest(100);
        int countOfElements = 0;
        int j;

        array.setElements(0, 11);
        array.setElements(1, 22);
        array.setElements(2, 33);
        array.setElements(3, 44);
        array.setElements(4, 55);
        array.setElements(5, 66);
        array.setElements(6, 77);
        array.setElements(7, 88);
        array.setElements(8, 99);
        array.setElements(9, 110);

        countOfElements = 10;  //количество элементов в массиве

        for (j = 0; j < countOfElements; j++)
            System.out.print(array.getElements(j) + "  ");
        System.out.println("");

        int searchElement = 33;   // элемент массива для поиска
        for (j = 0; j < countOfElements; j++)   //для каждого элемента
            if (array.getElements(j) == searchElement) break;   // найдено?
        if (j == countOfElements)  // не найдено - прошелся по всему массиву
            System.out.println("Can't find " + searchElement);
        else System.out.println("Found " + searchElement);   // найдено


        //удаление по ключу
        for (j = 0; j < countOfElements; j++)
            if (array.getElements(j)==55)
                break;
            for (int k = j; k<countOfElements; k++)  // сдвиг последующих
                // элементов
                array.setElements(k, array.getElements(k+1));
                countOfElements--;   // умеьшение размера массива

        for (j=0; j<countOfElements; j++)
            System.out.print(array.getElements(j)+ "  ");
        System.out.println("");

    }
}
