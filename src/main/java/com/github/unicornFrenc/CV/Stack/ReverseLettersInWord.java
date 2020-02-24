package com.github.unicornFrenc.CV.Stack;


public class ReverseLettersInWord {

    private String input;
    private String output;

    public ReverseLettersInWord(String in) {
        input = in;
    }

    public String doReverse() {
        int size = input.length();
        ReverseStack stack = new ReverseStack(size);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }

        output = "";

        while (!stack.isEmpty()) {
            char ch = stack.pop();
            output = output + ch;
        }
        return output;
    }
}
