package com.github.unicornFrenc.CV.Stack;


//стек на основе массива
public class Stack {

    private int maxSize;   //размер массива
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long topElem) {   //добавление элемента на вершине
        stackArray[++top] = topElem;
    }

    public long pop() {   //извлечение элемента из вершины стека
        return stackArray[top--];
    }

    public long peek()    //чтение вершины стека
    {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
