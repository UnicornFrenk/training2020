package com.github.unicornFrenc.CV.Stack;

public class ReverseStack {

    private int maxSize;   //размер массива
    private char[] stackArray;
    private int top;

    public ReverseStack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char topElem) {   //добавление элемента на вершине
        stackArray[++top] = topElem;
    }

    public char pop() {   //извлечение элемента из вершины стека
        return stackArray[top--];
    }

    public char peek()    //чтение вершины стека
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

