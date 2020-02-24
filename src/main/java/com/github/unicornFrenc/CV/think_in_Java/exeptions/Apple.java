package com.github.unicornFrenc.CV.think_in_Java.exeptions;

public class Apple {

    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}
