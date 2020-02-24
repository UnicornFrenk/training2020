package com.github.unicornFrenc.CV.Queue;

public class PriorityQueue {

    private int maxSize;
    private long[] priorArray;
    private int count;

    public PriorityQueue(int size) {
        maxSize = size;
        priorArray = new long[maxSize];
        count = 0;
    }

    public void insert(long value) {
        int i;
        if (count == 0) priorArray[count++] = value;
        else {
            for (i = count - 1; i >= 0; i--) {
                if (value > priorArray[i]) priorArray[i + 1] = priorArray[i];
                else break;
            }

            priorArray[i + 1] = value;
            count++;
        }
    }


    public long remove() {
        return priorArray[--count];
    }

    public long peekMin() {
        return priorArray[count - 1];
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == maxSize);
    }
}
