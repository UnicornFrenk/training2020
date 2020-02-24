package com.github.unicornFrenc.CV.arrays;

public class ArrayTest {

    private long [] array;

    public ArrayTest(int size) {
        array = new long[size];
    }

    public void setElements(int index, long value){
        array[index] = value;
    }

    public long getElements(int index){
        return array[index];
    }
}
