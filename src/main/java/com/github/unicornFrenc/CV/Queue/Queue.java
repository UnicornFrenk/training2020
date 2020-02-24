package com.github.unicornFrenc.CV.Queue;

public class Queue {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int count;


    public Queue(int size) {
        maxSize = size;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void insert(long value) {

        if (rear == maxSize - 1) rear = -1;
        queueArray[++rear] = value;
        count++;
    }

    public long remove() {
        long temp = queueArray[front++];
        if (front == maxSize) front = 0;
        count--;
        return temp;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == maxSize);
    }
}
