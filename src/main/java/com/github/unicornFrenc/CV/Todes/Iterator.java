package com.github.unicornFrenc.CV.Todes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("p")) {
                iterator.add("q");
                System.out.println(list);
                System.out.println(iterator.hasNext());
                System.out.println(iterator.hasPrevious());
              //  iterator.next();
                System.out.println(iterator.previous());
            }
        }
    }
}
