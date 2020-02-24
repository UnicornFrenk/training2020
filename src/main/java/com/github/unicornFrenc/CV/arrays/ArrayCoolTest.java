package com.github.unicornFrenc.CV.arrays;

public class ArrayCoolTest {

    private long[] array2;
    private int countOfElements;

    public ArrayCoolTest(int maxCountOfElements2) {
        array2 = new long[maxCountOfElements2];
        countOfElements = 0;    //текущее количество элементов

    }


    public boolean find(long searchElement) {
        int j = 0;
        for (j = 0; j < countOfElements; j++)
            if (array2[j] == searchElement) break;
        if (j == countOfElements) return false;
        else return true;
    }

    public void insert(long value) {
        array2[countOfElements] = value;
        countOfElements++;
    }

    public int binaryFind(long searchValue) {
        int lowerBound = 0;
        int upperBound = countOfElements - 1;
        int currentValue;

        while (true) {
            currentValue = (lowerBound + upperBound) / 2;
            if (array2[currentValue] == searchValue) return currentValue;

            else if (lowerBound > upperBound) return countOfElements;
            else {
                if (array2[currentValue] < searchValue)
                    lowerBound = currentValue + 1;  //поиск в верхней половине
                else upperBound = currentValue - 1; //поиск в нижней половине
            }
        }

    }


    public boolean delete(long value) {
        int j;
        for (j = 0; j < countOfElements; j++)
            if (value == array2[j]) break;
        if (j == countOfElements) return false;
        else {
            for (int k = j; k < countOfElements; k++)
                array2[k] = array2[k + 1];
            countOfElements--;
            return true;

        }
    }


    public void display() {
        for (int j = 0; j < countOfElements; j++)
            System.out.print(array2[j] + "  ");
        System.out.println("");
    }
}
