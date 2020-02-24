package com.github.unicornFrenc.CV.exeptions;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class App {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }

    // throws:
    public static void main1(String[] args) throws Throwable {
    }

    //catch
    public static void main2(String[] args) {
        try {
        } catch (Throwable t) {}
    }

    //throw
    public static void main3(String[] args) {
        // Error - потомок Throwable
        throw new Error();
    }



}