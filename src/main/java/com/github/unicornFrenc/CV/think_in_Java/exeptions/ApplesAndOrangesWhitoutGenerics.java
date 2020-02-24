package com.github.unicornFrenc.CV.think_in_Java.exeptions;

import java.util.ArrayList;

//Trow new Exeption (в объявлении метода)

//An exception is an unwanted or unexpected event,
// which occurs during the execution of a program i.e at run time,

//Error: An Error indicates serious problem that a reasonable application should not try to catch.
//Exception: Exception indicates conditions that a reasonable application
// might try to catch.


//All exception and errors types are sub classes of class Throwable
//Exeption =
// checked (throws)
// +
// unchecked (error + runtime)


public class ApplesAndOrangesWhitoutGenerics {
    public static void main(String[] args) {
        try {
            ArrayList apples = new ArrayList<>();
            for (int i = 0; i < 3; i++)
                apples.add(new Apple());
            apples.add(new Orange());
            for (int i = 0; i < apples.size(); i++)
                ((Apple) apples.get(i)).id();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
