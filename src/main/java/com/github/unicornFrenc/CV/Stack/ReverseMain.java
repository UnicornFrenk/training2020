package com.github.unicornFrenc.CV.Stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseMain {

    public static void main(String[] args) throws IOException {
        String input, output;

        while (true){
            System.out.println(" Enter a string:  ");
            System.out.flush();   //заливка из буфера в поток
            input = getString();
            if(input.equals(""))
                break;

            ReverseLettersInWord  reverseStack = new ReverseLettersInWord(input);
            output = reverseStack.doReverse();
            System.out.println(" Reversed " + output);

        }
    }



    public static String getString() throws IOException{
        InputStreamReader inputStreamReader  = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        return str;

    }
}
