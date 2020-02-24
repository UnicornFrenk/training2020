package com.github.unicornFrenc.CV.Stack;

public class StackMain {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(60);

    while (!stack.isEmpty()){
        long value = stack.pop();
        System.out.print(value);
        System.out.print(" ");
    }

        System.out.println("");   //стек выводится в обратном порядке!!!
    }
}
